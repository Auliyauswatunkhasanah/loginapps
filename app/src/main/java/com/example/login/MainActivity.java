package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edNama, edPass;
    TextView tHasil;
    Button bKirim;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.editUN);
        edPass = findViewById(R.id.editPass);
        tHasil = findViewById(R.id.hsltxt);
        bKirim = findViewById(R.id.btnok);

        bKirim.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                //Membaca input dari edittext
                user = edNama.getText().toString();
                pass = edPass.getText().toString();

                //Menampilkan pesan
                if (pass.equals("123")) {
                    Toast.makeText(getApplicationContext(), "Login Sukses",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Password Salah",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
