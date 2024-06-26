package com.gtappdevelopers.firebasestorageimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button generaterBtn,scanBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        generaterBtn = findViewById(R.id.idBtnGenerater);
        scanBtn = findViewById(R.id.idBtnScan);
        generaterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,GenerateEsealActivity.class);
                startActivity(i);
            }
        });
        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,ScanQRCodeActivity.class);
                startActivity(i);
            }
        });
    }
}