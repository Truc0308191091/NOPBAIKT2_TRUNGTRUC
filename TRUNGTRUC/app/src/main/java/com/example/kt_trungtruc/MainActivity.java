package com.example.kt_trungtruc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView img1, img2, img3, img4, img5;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);

        img1.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i);

        });
        img2.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity3.class);
            startActivity(i);

        });
        img3.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity4.class);
            startActivity(i);

        });
        img4.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity5.class);
            startActivity(i);

        });
        img5.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity6.class);
            startActivity(i);

        });


    }
    public void xuLyThoat(View view){
        finish();

    }
}