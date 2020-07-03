package com.nonamedev.siapcpns;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class SoalTIUPaketDActivity extends AppCompatActivity {
    private TextView textViewQuestion;
    private TextView textViewScore;
    private TextView textViewQuestionCount;
    private TextView textViewCountDown;
    private RadioGroup rbGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private RadioButton rb5;
    private Button buttonConfirmNext;
    int nomor = 0;
    public static int hasil, benar, salah;

    //pertanyaan
    String[] pertanyaan_kuis = new String[10];

    //pilihan jawaban a, b, c, d, e
    String[] pilihan_jawaban = new String[50];

    //jawaban benar
    Integer[] jawaban_benar = new Integer[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_tiu_paket_d);
        textViewQuestion = findViewById(R.id.text_view_question);
        textViewQuestionCount = findViewById(R.id.text_view_question_count);
        rbGroup = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_button1);
        rb2 = findViewById(R.id.radio_button2);
        rb3 = findViewById(R.id.radio_button3);
        rb4 = findViewById(R.id.radio_button4);
        rb5 = findViewById(R.id.radio_button5);
        buttonConfirmNext = findViewById(R.id.button_confirm_next);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://simpleproject.xyz/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonPlaceHolderApi JsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<List<DataSoal>> call = JsonPlaceHolderApi.getPosts();
        call.enqueue(new Callback<List<DataSoal>>() {
            @Override
            public void onResponse(Call<List<DataSoal>> call, Response<List<DataSoal>> response) {
                if (!response.isSuccessful()) {
                    textViewQuestion.setText("Code: " + response.code());
                    return;
                }
                List<DataSoal> posts = response.body();
                int i = 0;
                int j = 0;
                for (DataSoal post : posts) {
                    int ts=Integer.parseInt(post.getTipeSoal());
                    if (ts == 4) {
                        pertanyaan_kuis[i] = post.getPertanyaan();
                        pilihan_jawaban[j] = post.getPilihanA();
                        pilihan_jawaban[j+1] = post.getPilihanB();
                        pilihan_jawaban[j+2] = post.getPilihanC();
                        pilihan_jawaban[j+3] = post.getPilihanD();
                        pilihan_jawaban[j+4] = post.getPilihanE();
                        jawaban_benar[i] = post.getJawabanbenar();
                        i++;
                        j+=4;
                    }
                }
                textViewQuestion.setText(pertanyaan_kuis[nomor]);
                rb1.setText(pilihan_jawaban[0]);
                rb2.setText(pilihan_jawaban[1]);
                rb3.setText(pilihan_jawaban[2]);
                rb4.setText(pilihan_jawaban[3]);
                rb5.setText(pilihan_jawaban[4]);
                textViewQuestionCount.setText("Pertanyaan : " + (nomor+1) + "/" + pertanyaan_kuis.length);
            }
            @Override
            public void onFailure(Call<List<DataSoal>> call, Throwable t) {
                textViewQuestion.setText(t.getMessage());
            }
        });
        rbGroup.check(0);
        benar = 0;
        salah = 0;
    }

    @SuppressLint("SetTextI18n")
    public void next(View view) {
        if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked() || rb5.isChecked()) {

            RadioButton jawaban_user = (RadioButton) findViewById(rbGroup.getCheckedRadioButtonId());
            RadioButton rbSelected = findViewById(rbGroup.getCheckedRadioButtonId());
            int ambil_jawaban_user = rbGroup.indexOfChild(rbSelected) + 1;
            rbGroup.check(0);
            if (ambil_jawaban_user == jawaban_benar[nomor]) benar++;
            else salah++;
            nomor++;
            if (nomor < pertanyaan_kuis.length) {
                textViewQuestion.setText(pertanyaan_kuis[nomor]);
                rb1.setText(pilihan_jawaban[(nomor * 4) + 0]);
                rb2.setText(pilihan_jawaban[(nomor * 4) + 1]);
                rb3.setText(pilihan_jawaban[(nomor * 4) + 2]);
                rb4.setText(pilihan_jawaban[(nomor * 4) + 3]);
                rb5.setText(pilihan_jawaban[(nomor * 4) + 4]);
                textViewQuestionCount.setText("Pertanyaan : " + (nomor+1) + "/" + pertanyaan_kuis.length);

            } else {
                hasil = benar * 20;
                Intent selesai = new Intent(getApplicationContext(), HasilTIUPaketDActivity.class);
                startActivity(selesai);
            }
        }
        else {
            Toast.makeText(this,"Kamu Jawab Dulu",Toast.LENGTH_LONG).show();
        }
    }
}
