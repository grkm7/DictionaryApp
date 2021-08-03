package com.info.sozlukuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {
    private TextView textViewIngilizce;
    private  TextView textViewTurkce;
    private Kelimeler kelime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        textViewIngilizce = findViewById(R.id.textViewIngilizce);
        textViewTurkce = findViewById(R.id.textViewTurkce);

        kelime = (Kelimeler) getIntent().getSerializableExtra("nesne");

        textViewIngilizce.setText(kelime.getIngilizce());
        textViewTurkce.setText(kelime.getTurkce());

    }
}