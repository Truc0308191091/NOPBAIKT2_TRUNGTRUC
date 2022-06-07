package com.example.kt_trungtruc;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class TTSVActivity extends AppCompatActivity {
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttsvactivity);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("TTSV");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                makeText(this, "Bạn bấm vào menu 1", LENGTH_SHORT).show();
                //code xử lý khi bấm menu1
                break;
            case R.id.menu2:
                makeText(this, "Bạn bấm vào menu 2", LENGTH_SHORT).show();
                //code xử lý khi bấm menu2
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(TTSVActivity.this,MainActivity3.class);
                startActivity(i);
                break;
            case R.id.menu4:
                makeText(this, "Bạn bấm vào menu 2", LENGTH_SHORT).show();
                //code xử lý khi bấm menu2
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

}