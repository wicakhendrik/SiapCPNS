package com.nonamedev.siapcpns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class SoalTIUPaketAActivity extends AppCompatActivity {
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
    private ColorStateList textColorDefaultRb;
    private List<DataSoal> questionList;
    private int questionCounter;
    private int questionCountTotal;
    private DataSoal currentQuestion;
    private int score;
    private boolean answered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_tiu_paket_a);
        textViewQuestion = findViewById(R.id.text_view_question);

        textViewScore = findViewById(R.id.text_view_score);
        textViewQuestionCount = findViewById(R.id.text_view_question_count);
        textViewCountDown = findViewById(R.id.text_view_countdown);
        rbGroup = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_button1);
        rb2 = findViewById(R.id.radio_button2);
        rb3 = findViewById(R.id.radio_button3);
        rb4 = findViewById(R.id.radio_button4);
        rb5 = findViewById(R.id.radio_button5);
        buttonConfirmNext = findViewById(R.id.button_confirm_next);
        textColorDefaultRb = rb1.getTextColors();
        questionList = getAllSoal();
        questionCountTotal = questionList.size();
        Collections.shuffle(questionList);
        showNextQuestion();

        buttonConfirmNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answered) {
                    if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked() || rb5.isChecked()) {
                        checkAnswer();
                    } else {
                        Toast.makeText(SoalTIUPaketAActivity.this, "Please select an answer", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    showNextQuestion();
                }
            }
        });

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

                for (DataSoal post : posts) {
                    int ts=Integer.parseInt(post.getTipeSoal());
                    if (ts == 1) {
                        String content = "";
                        content = post.getPertanyaan();
                        textViewQuestion.append(content);
                    }
                }
            }
            @Override
            public void onFailure(Call<List<DataSoal>> call, Throwable t) {
                textViewQuestion.setText(t.getMessage());
            }
        });
    }

    private void showNextQuestion() {
        rb1.setTextColor(textColorDefaultRb);
        rb2.setTextColor(textColorDefaultRb);
        rb3.setTextColor(textColorDefaultRb);
        rb4.setTextColor(textColorDefaultRb);
        rb5.setTextColor(textColorDefaultRb);
        rbGroup.clearCheck();
        if (questionCounter < questionCountTotal) {
            currentQuestion = questionList.get(questionCounter);
            textViewQuestion.setText(currentQuestion.getPertanyaan());
            rb1.setText(currentQuestion.getPilihanA());
            rb2.setText(currentQuestion.getPilihanB());
            rb3.setText(currentQuestion.getPilihanC());
            rb4.setText(currentQuestion.getPilihanD());
            rb5.setText(currentQuestion.getPilihanE());
            questionCounter++;
            textViewQuestionCount.setText("Question: " + questionCounter + "/" + questionCountTotal);
            answered = false;
            buttonConfirmNext.setText("Confirm");
        } else {
            finishQuiz();
        }
    }
    private void checkAnswer() {
        answered = true;
        RadioButton rbSelected = findViewById(rbGroup.getCheckedRadioButtonId());
        int answerNr = rbGroup.indexOfChild(rbSelected) + 1;
        if (answerNr == currentQuestion.getJawabanbenar()) {
            score++;
            textViewScore.setText("Score: " + score);
        }
        showSolution();
    }
    private void showSolution() {
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);
        rb4.setTextColor(Color.RED);
        rb5.setTextColor(Color.RED);
        switch (currentQuestion.getJawabanbenar()) {
            case 1:
                rb1.setTextColor(Color.GREEN);
                textViewQuestion.setText("Answer 1 is correct");
                break;
            case 2:
                rb2.setTextColor(Color.GREEN);
                textViewQuestion.setText("Answer 2 is correct");
                break;
            case 3:
                rb3.setTextColor(Color.GREEN);
                textViewQuestion.setText("Answer 3 is correct");
                break;
            case 4:
                rb4.setTextColor(Color.GREEN);
                textViewQuestion.setText("Answer 4 is correct");
                break;
            case 5:
                rb5.setTextColor(Color.GREEN);
                textViewQuestion.setText("Answer 5 is correct");
                break;
        }
        if (questionCounter < questionCountTotal) {
            buttonConfirmNext.setText("Next");
        } else {
            buttonConfirmNext.setText("Finish");
        }
    }
    private void finishQuiz() {
        finish();
    }

    public List<DataSoal> getAllSoal() {
        List<DataSoal> soalList = new ArrayList<>();
        DataSoal question = new DataSoal();

        question.setIdSoal(question.getIdSoal());
        question.setPertanyaan(question.getPertanyaan());
        question.setPilihanA(question.getPilihanA());
        question.setPilihanB(question.getPilihanB());
        question.setPilihanC(question.getPilihanC());
        question.setPilihanD(question.getPilihanD());
        question.setPilihanE(question.getPilihanE());
        question.setJawabanbenar(question.getJawabanbenar());
        question.setTipeSoal(question.getTipeSoal());
        soalList.add(question);
        return soalList;
    }
}
