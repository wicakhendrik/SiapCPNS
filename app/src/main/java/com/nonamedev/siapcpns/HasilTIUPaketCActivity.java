package com.nonamedev.siapcpns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HasilTIUPaketCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_tiu_paket_c);

        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar :"+SoalTIUPaketCActivity.benar+"\nJawaban Salah :"+SoalTIUPaketCActivity.salah);
        nilai.setText(""+SoalTIUPaketCActivity.hasil);
    }

    public void ulangi(View view){
        finish();
        Intent a = new Intent(getApplicationContext(),SoalTIUPaketCActivity.class);
        startActivity(a);
    }
}
