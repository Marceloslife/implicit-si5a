package com.si5a.implicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etUrl, etLokasi, etText;
    Button btnBukaWebsite, btnBukaLokasi, btnBagikanTeks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUrl = findViewById(R.id.et_url);
        etLokasi = findViewById(R.id.et_Lokasi);
        etText = findViewById(R.id.et_Teks);
        btnBukaWebsite = findViewById(R.id.btn_bukawebsite);
        btnBukaLokasi = findViewById(R.id.btn_buka_lokasi);
        btnBagikanTeks = findViewById(R.id.btn_bagikanteks);

        btnBukaWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlWebsite = etUrl.getText().toString();
                Uri uriUrlWebsite = Uri.parse(urlWebsite);
                Intent intentWebsite = new Intent(Intent.ACTION_VIEW, uriUrlWebsite);
                try {
                    startActivity(intentWebsite);
                }catch (Exception e){
                    etUrl.setError("Url Tidak Sesuai");
                }
            }


    })
;}}