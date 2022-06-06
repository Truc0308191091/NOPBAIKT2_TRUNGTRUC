package com.example.kt_trungtruc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ListviewActivity extends AppCompatActivity {
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("KT Số 3");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                Toast.makeText(this, "Bạn bấm vào menu 1", Toast.LENGTH_SHORT).show();
                //code xử lý khi bấm menu1
                break;
            case R.id.menu2:
                Toast.makeText(this, "Bạn bấm vào menu 2", Toast.LENGTH_SHORT).show();
                //code xử lý khi bấm menu2
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(ListviewActivity.this,MainActivity3.class);
                startActivity(i);
                break;
            case R.id.menu4:
                Toast.makeText(this, "Bạn bấm vào menu 2", Toast.LENGTH_SHORT).show();
                //code xử lý khi bấm menu2
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void moManHinhListView1(View view) {
        i = new Intent(ListviewActivity.this,Listview1Activity.class);
        startActivity(i);
    }

    public void moManHinhListView2(View view) {
        i = new Intent(ListviewActivity.this,Listview2Activity.class);
        startActivity(i);
    }

    public void moManHinhListView3(View view) {
        i = new Intent(ListviewActivity.this,Listview3Activity.class);
        startActivity(i);
    }
}