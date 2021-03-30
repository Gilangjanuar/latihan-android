package com.example.sesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtSatu;
    private EditText editTxtDua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxtSatu = findViewById(R.id.editTxtSatu);
        editTxtDua = findViewById(R.id.editTxtDua);
        EditText editTxtHasil = findViewById(R.id.editTxtHasil);
        Button btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(String.valueOf(editTxtSatu.getText()));
                int angka2 = Integer.parseInt(String.valueOf(editTxtDua.getText()));
                editTxtHasil.setText(angka1 - angka2);
            }
        });
    }
}