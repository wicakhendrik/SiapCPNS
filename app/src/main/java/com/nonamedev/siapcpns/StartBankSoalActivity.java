package com.nonamedev.siapcpns;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nonamedev.siapcpns.ui.banksoal.BankSoalFragment;

public class StartBankSoalActivity extends AppCompatActivity {
    public static int id_tipe_soal;
    private TextView textViewStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_bank_soal);
        textViewStart = findViewById(R.id.textViewStart);
        if ( BankSoalFragment.id == 1) {
            setTitle("TIU Paket A");
            textViewStart.setText("TIU Paket A");
        }
        else if ( BankSoalFragment.id == 2) {
            setTitle("TIU Paket B");
            textViewStart.setText("TIU Paket B");
        }
        else if ( BankSoalFragment.id == 3) {
            setTitle("TIU Paket C");
            textViewStart.setText("TIU Paket C");
        }
        else if ( BankSoalFragment.id == 4) {
            setTitle("TIU Paket D");
            textViewStart.setText("TIU Paket D");
        }
        else if ( BankSoalFragment.id == 5) {
            setTitle("TWK Paket A");
            textViewStart.setText("TWK Paket A");
        }
        else if ( BankSoalFragment.id == 6) {
            setTitle("TWK Paket B");
            textViewStart.setText("TWK Paket B");
        }
        else if ( BankSoalFragment.id == 7) {
            setTitle("TWK Paket C");
            textViewStart.setText("TWK Paket C");
        }
        else if ( BankSoalFragment.id == 8) {
            setTitle("TWK Paket D");
            textViewStart.setText("TWK Paket D");
        }

        Button buttonStartQuiz = findViewById(R.id.button_start_quiz);
        buttonStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });
    }

    private void startQuiz() {
        id_tipe_soal = BankSoalFragment.id;
        Intent intent = new Intent(StartBankSoalActivity.this, BankSoalActivity.class);

        startActivity(intent);
    }
}
