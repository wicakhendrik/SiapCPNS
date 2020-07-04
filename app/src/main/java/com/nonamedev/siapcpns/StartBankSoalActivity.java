package com.nonamedev.siapcpns;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nonamedev.siapcpns.ui.banksoal.BankSoalFragment;
import com.nonamedev.siapcpns.ui.simulasi.SimulasiFragment;

public class StartBankSoalActivity extends AppCompatActivity {
    public static int id_tipe_soal;
    private TextView textViewStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_bank_soal);
        textViewStart = findViewById(R.id.textViewStart);
        if ( BankSoalFragment.id == 1) {
            id_tipe_soal = BankSoalFragment.id;
            setTitle("TIU Paket A");
            textViewStart.setText("TIU Paket A");
        }
        else if ( BankSoalFragment.id == 2) {
            id_tipe_soal = BankSoalFragment.id;
            setTitle("TIU Paket B");
            textViewStart.setText("TIU Paket B");
        }
        else if ( BankSoalFragment.id == 3) {
            id_tipe_soal = BankSoalFragment.id;
            setTitle("TIU Paket C");
            textViewStart.setText("TIU Paket C");
        }
        else if ( BankSoalFragment.id == 4) {
            id_tipe_soal = BankSoalFragment.id;
            setTitle("TIU Paket D");
            textViewStart.setText("TIU Paket D");
        }
        else if ( BankSoalFragment.id == 5) {
            id_tipe_soal = BankSoalFragment.id;
            setTitle("TWK Paket A");
            textViewStart.setText("TWK Paket A");
        }
        else if ( BankSoalFragment.id == 6) {
            id_tipe_soal = BankSoalFragment.id;
            setTitle("TWK Paket B");
            textViewStart.setText("TWK Paket B");
        }
        else if ( BankSoalFragment.id == 7) {
            id_tipe_soal = BankSoalFragment.id;
            setTitle("TWK Paket C");
            textViewStart.setText("TWK Paket C");
        }
        else if ( BankSoalFragment.id == 8) {
            id_tipe_soal = BankSoalFragment.id;
            setTitle("TWK Paket D");
            textViewStart.setText("TWK Paket D");
        }
        else if (SimulasiFragment.id == 1) {
            id_tipe_soal = SimulasiFragment.id;
            setTitle("Simulasi Paket 1");
            textViewStart.setText("Simulasi Paket 1");
        }
        else if (SimulasiFragment.id == 3) {
            id_tipe_soal = SimulasiFragment.id;
            setTitle("Simulasi Paket 2");
            textViewStart.setText("Simulasi Paket 2");
        }
        else if (SimulasiFragment.id == 5) {
            id_tipe_soal = SimulasiFragment.id;
            setTitle("Simulasi Paket 3");
            textViewStart.setText("Simulasi Paket 3");
        }
        else if (SimulasiFragment.id == 7) {
            id_tipe_soal = SimulasiFragment.id;
            setTitle("Simulasi Paket 4");
            textViewStart.setText("Simulasi Paket 4");
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
        Intent intent = new Intent(StartBankSoalActivity.this, BankSoalActivity.class);

        startActivity(intent);
    }
}
