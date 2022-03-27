package com.example.exercise1pam;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hasil_Activity extends AppCompatActivity {
    TextView txJadwal, txHari, txTanggal;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txJadwal = findViewById(R.id.Hasil_Jadwal);
        txHari = findViewById(R.id.Hasil_Hari);
        txTanggal = findViewById(R.id.Hasil_Tanggal);
        Bundle bundle=getIntent().getExtras();
        String jdwl=bundle.getString("a");
        String hr=bundle.getString("b");
        String tgl=bundle.getString("c");
        txJadwal.setText(jdwl);
        txHari.setText(hr);
        txTanggal.setText(tgl);

    }
}
