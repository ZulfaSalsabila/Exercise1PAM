package com.example.exercise1pam;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Home_Activity extends AppCompatActivity {
    EditText edJadwal, edHari, edTanggal;
    String jadwal, hari, tanggal;
    FloatingActionButton fab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        edJadwal = findViewById(R.id.inputjadwal);
        edHari = findViewById(R.id.inputhari);
        edTanggal = findViewById(R.id.inputtanggal);
        fab = findViewById(R.id.fabsimpan);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jadwal = edJadwal.getText().toString();
                hari = edHari.getText().toString();
                tanggal = edTanggal.getText().toString();

                if (
                        edJadwal.getText().toString().isEmpty() ||
                                edHari.getText().toString().isEmpty() ||
                                edTanggal.getText().toString().isEmpty()) {
                    Snackbar.make(view, "Wajib isi semua Data!!", Snackbar.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Data Sukses Tersimpan!!", Toast.LENGTH_LONG).show();
                    Bundle b = new Bundle();
                    b.putString("a", jadwal.trim());
                    b.putString("b", hari.trim());
                    b.putString("c", tanggal.trim());
                    Intent i = new Intent(getApplicationContext(), Hasil_Activity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });
        }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu, menu);
            return super.onCreateOptionsMenu(menu);
        }
    }

