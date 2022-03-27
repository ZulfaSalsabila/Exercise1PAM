package com.example.exercise1pam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class Register_Activity extends AppCompatActivity {
    EditText reNama, reEmail, rePass, reRpass;
    Button btnRgs;
    String Nama, Email, Password, Repassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        reNama = findViewById(R.id.masukkan_nama);
        reEmail = findViewById(R.id.tulisemail);
        rePass = findViewById(R.id.masukkan_pass);
        reRpass = findViewById(R.id.masukkan_repass);
        btnRgs =findViewById(R.id.register);

       btnRgs.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Nama=reNama.getText().toString();
               Email=reEmail.getText().toString();
               Password=rePass.getText().toString();
               Repassword=reRpass.getText().toString();

               if (
                      reNama.getText().toString().length()
                                ==0){
                            reNama.setError("Masukkan Nama");
               }
               if (
                       reEmail.getText().toString().length()
                                ==0){
                            reEmail.setError("Masukkan Email");
               }
               if (
                       rePass.getText().toString().length()
                                ==0){
                            rePass.setError("Masukkan Password");
               }
               if (
                       reRpass.getText().toString().length()
                                ==0){
                            reRpass.setError("Masukkan Re-password");
               }

               else {
                   if (rePass.getText().toString().equals(rePass.getText().toString())){
                       Toast.makeText(getApplicationContext(), "Registrasi Berhasil", Toast.LENGTH_LONG).show();
                       Bundle b = new Bundle();
                       b.putString("a",Nama.trim());

                       Intent i = new Intent(getApplicationContext(),Home_Activity.class);
                       i.putExtras(b);
                       startActivity(i);
                   }
                   else {
                       Snackbar.make(view,"Password dan Re-Password Harus sama!!", Snackbar.LENGTH_LONG).show();
                   }
               }
           }
       });
    }
}
