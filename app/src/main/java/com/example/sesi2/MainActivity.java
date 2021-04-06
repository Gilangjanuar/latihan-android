package com.example.sesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.text.TextUtils.isEmpty;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtSatu;
    private EditText editTxtDua;
    private Button btnHitung;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnKali;
    private Button btnBagi;
    private EditText editTxtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxtSatu = findViewById(R.id.editTxtSatu);
        editTxtDua = findViewById(R.id.editTxtDua);
        editTxtHasil = findViewById(R.id.editTxtHasil);
        btnHitung = findViewById(R.id.btnHitung);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1 = editTxtSatu.getText().toString();
                String angka2 = editTxtDua.getText().toString();
                notNull();
                editTxtHasil.setText(String.valueOf((Integer.parseInt(angka1) + Integer.parseInt(angka2)*2)));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1 = editTxtSatu.getText().toString();
                String angka2 = editTxtDua.getText().toString();
                notNull();
                editTxtHasil.setText(String.valueOf(Integer.parseInt(angka1) - Integer.parseInt(angka2)));
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1 = editTxtSatu.getText().toString();
                String angka2 = editTxtDua.getText().toString();
                notNull();
                editTxtHasil.setText(String.valueOf(Integer.parseInt(angka1) + Integer.parseInt(angka2)));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1 = editTxtSatu.getText().toString();
                String angka2 = editTxtDua.getText().toString();
                notNull();
                editTxtHasil.setText(String.valueOf(Integer.parseInt(angka1) * Integer.parseInt(angka2)));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1 = editTxtSatu.getText().toString();
                String angka2 = editTxtDua.getText().toString();
                notNull();
                editTxtHasil.setText(String.valueOf(Integer.parseInt(angka1) / Integer.parseInt(angka2)));

            }
        });
    }

    private void notNull() {
        if (isEmpty(editTxtSatu.getText().toString())) {
            editTxtSatu.setError("WAJIB DIISI");
            return;
        }

        if (isEmpty(editTxtDua.getText().toString())) {
            editTxtDua.setError("WAJIB DIISI");
            return;
        }
    }
}