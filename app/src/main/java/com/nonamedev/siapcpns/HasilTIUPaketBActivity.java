package com.nonamedev.siapcpns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HasilTIUPaketBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_tiu_paket_b);

        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar :"+SoalTIUPaketBActivity.benar+"\nJawaban Salah :"+SoalTIUPaketBActivity.salah);
        nilai.setText(""+SoalTIUPaketBActivity.hasil);
    }

    public void ulangi(View view){
        finish();
        Intent a = new Intent(getApplicationContext(),SoalTIUPaketBActivity.class);
        startActivity(a);
    }
}
