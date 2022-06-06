package com.example.kt_trungtruc;

import static android.widget.Toast.*;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Listview1Activity extends AppCompatActivity {
    Intent i;
    ListView Listviewdata1;
    String []arrData = {"Lê Huế Anh","Đỗ Gia Bảo","Nguyễn Chí Cường","Đặng Thụy Thanh Duy","Lê Thanh Huy","Phạm Huỳnh Nhật Huy","Trượng Lệ Hào","Đinh Nguyễn Trường Hải","Đặng Anh Kiệt","Lê Đức Lợi","Huỳnh Hữu Lý","Huỳnh Đức Lộc","Chế Phương Nam","Trần Hiếu Nghĩa","Minh Nhựt Nguyễn Thanh","Trần Đức Nhân","Lê Phú Phúc",""};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview1);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView1");
        actionBar.setDisplayHomeAsUpEnabled(true);
        addControls();
        addIvent();

    }

    private void addIvent() {
        Listviewdata1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                makeText(Listview1Activity.this, "Bạn chọn:" + arrData[i], LENGTH_SHORT).show();
            }
        });

    }

    private void addControls() {
        Listviewdata1 = findViewById(R.id.Listviewdata1);
        // tạo Adapter
        adapter = new ArrayAdapter<String>(Listview1Activity.this, android.R.layout.simple_list_item_1,arrData);
        // gán Adapter cho Listview
        Listviewdata1.setAdapter(adapter);

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
                makeText(this, "Bạn bấm vào menu 1", LENGTH_SHORT).show();
                //code xử lý khi bấm menu1
                break;
            case R.id.menu2:
                makeText(this, "Bạn bấm vào menu 2", LENGTH_SHORT).show();
                //code xử lý khi bấm menu2
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(Listview1Activity.this,MainActivity3.class);
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