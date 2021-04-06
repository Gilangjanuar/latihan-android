package com.example.sesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtSatu;
    private EditText editTxtDua;
    private Button btnHitung;
    EditText editTxtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxtSatu = findViewById(R.id.editTxtSatu);
        editTxtDua = findViewById(R.id.editTxtDua);
        editTxtHasil = findViewById(R.id.editTxtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1 = editTxtSatu.getText().toString();
                String angka2 = editTxtDua.getText().toString();
                editTxtHasil.setText(Integer.parseInt(angka1) + Integer.parseInt(angka2));
//                Toast.makeText(MainActivity.this, "HELLO WORLD", Toast.LENGTH_LONG).show();
            }
        });
    }
}