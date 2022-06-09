package com.example.kt_trungtruc;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kt_trungtruc.adapter.SanPhamAdapter;
import com.example.kt_trungtruc.model.SanPham;

public class Listview4Activity extends AppCompatActivity {
  ListView lvSanPham;
  SanPhamAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview4);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView4");
        actionBar.setDisplayHomeAsUpEnabled(true);
        addControls();
        addEvents();
        fakeData();
    }

    private void fakeData() {
        sanPhamAdapter.add(new SanPham(R.drawable.avt,"San Pham 1",60000));
        sanPhamAdapter.add(new SanPham(R.drawable.avt,"San Pham 2",60000));
        sanPhamAdapter.add(new SanPham(R.drawable.avt,"San Pham 3",60000));
        sanPhamAdapter.add(new SanPham(R.drawable.avt,"San Pham 4",60000));
        sanPhamAdapter.add(new SanPham(R.drawable.avt,"San Pham 5",60000));
        sanPhamAdapter.add(new SanPham(R.drawable.avt,"San Pham 6",60000));
        sanPhamAdapter.add(new SanPham(R.drawable.avt,"San Pham 7",60000));
        sanPhamAdapter.add(new SanPham(R.drawable.avt,"San Pham 8",60000));
        sanPhamAdapter.add(new SanPham(R.drawable.avt,"San Pham 9",60000));
        sanPhamAdapter.add(new SanPham(R.drawable.avt,"San Pham 10",60000));



    }

    private void addEvents() {

lvSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        SanPham sp = sanPhamAdapter.getItem(i);
        Toast.makeText(Listview4Activity.this,"Ban chon"+ sp.getTen(), Toast.LENGTH_LONG).show();
    }
});
    }

    private void addControls() {
        lvSanPham = findViewById(R.id.lvSanPham);
        sanPhamAdapter = new SanPhamAdapter(Listview4Activity.this,R.layout.item);
        lvSanPham.setAdapter(sanPhamAdapter);
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
                Toast.makeText(this,"Bạn vừa chọn menu 1",Toast.LENGTH_LONG).show();
                //code xử lý khi bấm menu1
                break;
            case R.id.menu2:
                Toast.makeText(this,"Bạn vừa chọn menu 2",Toast.LENGTH_LONG).show();
                //code xử lý khi bấm menu2
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                Toast.makeText(this,"Bạn vừa chọn menu 3",Toast.LENGTH_LONG).show();
                break;
            case R.id.menu4:
                Toast.makeText(this,"Bạn vừa chọn menu 4",Toast.LENGTH_LONG).show();
                //code xử lý khi bấm menu2
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

}