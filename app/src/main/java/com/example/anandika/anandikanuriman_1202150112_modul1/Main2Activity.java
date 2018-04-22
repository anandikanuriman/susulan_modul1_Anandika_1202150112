package com.example.anandika.anandikanuriman_1202150112_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String makanan = intent.getStringExtra("makanan");
        String jumlahporsi = intent.getStringExtra("jumlahporsi");
        String rm = intent.getStringExtra("RM");
        TextView namamakanan = findViewById(R.id.nama_menu);
        TextView porsi = findViewById(R.id.jumlah);
        TextView tempatmakan = findViewById(R.id.tempat_makan);
        TextView hitung = findViewById(R.id.jumlah1);
        int A = Integer.parseInt(jumlahporsi);

        int HargaEatbus = 50000 * A;
        String B = String.valueOf(HargaEatbus);

        int C = Integer.parseInt(jumlahporsi);
        int HargaAbnormal = 30000 * C;
        String D = String.valueOf(HargaAbnormal);


        if (rm.equalsIgnoreCase("EATBUS")) {
            int uang = 65500;
            if (HargaEatbus > uang) {

                namamakanan.setText(makanan);
                porsi.setText(jumlahporsi);
                tempatmakan.setText(rm);
                hitung.setText(B);
                Toast.makeText(this, "Jangan makan disini, uangnya ga cukup", Toast.LENGTH_LONG).show();
            } else {
                namamakanan.setText(makanan);
                porsi.setText(jumlahporsi);
                tempatmakan.setText(rm);
                hitung.setText(B);
                Toast.makeText(this, "Uang kamu cukup buat makan malam disini!", Toast.LENGTH_LONG).show();
            }

        } else {
            int uang = 65500;
            if (HargaAbnormal > uang) {

                namamakanan.setText(makanan);
                porsi.setText(jumlahporsi);
                tempatmakan.setText(rm);
                hitung.setText(D);
                Toast.makeText(this, "Jangan makan disini, uangnya ga cukup", Toast.LENGTH_LONG).show();
            } else {
                namamakanan.setText(makanan);
                porsi.setText(jumlahporsi);
                tempatmakan.setText(rm);
                hitung.setText(D);
                Toast.makeText(this, "Uang kamu cukup buat makan malam disini!", Toast.LENGTH_LONG).show();
            }
        }

    }

}