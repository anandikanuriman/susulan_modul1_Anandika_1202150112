package com.example.anandika.anandikanuriman_1202150112_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText EditMenu;
    private EditText Porsi;
    private Button Eatbus;
    private Button Abnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditMenu = findViewById(R.id.pesanan);
        Porsi = findViewById(R.id.jumlah_porsi);
        Eatbus = findViewById(R.id.button_eatbus);
        Abnormal = findViewById(R.id.button_abnormal);


    }

    public void Eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        String makanan = EditMenu.getText().toString();
        String jumlahporsi = Porsi.getText().toString();
        String rm = Eatbus.getText().toString();


        intent.putExtra("makanan", makanan);
        intent.putExtra("jumlahporsi", jumlahporsi);
        intent.putExtra("RM", rm);

        startActivity(intent);
    }

    public void Abnormal(View view) {

        Intent intent = new Intent(this, Main2Activity.class);

        String makanan = EditMenu.getText().toString();
        String jumlahporsi = Porsi.getText().toString();
        String rm = Abnormal.getText().toString();


        intent.putExtra("makanan", makanan);
        intent.putExtra("jumlahporsi", jumlahporsi);
        intent.putExtra("RM", rm);

        startActivity(intent);
    }
}