package com.example.kt_trungtruc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kt_trungtruc.adapter.KT5Adapter;
import com.example.kt_trungtruc.adapter.SanPhamAdapter;
import com.example.kt_trungtruc.model.KT5;
import com.example.kt_trungtruc.model.SanPham;

public class Listview5Activity extends AppCompatActivity {

    ListView lvProduct;
    KT5Adapter kt5Adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview5);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Sales");
        actionBar.setDisplayHomeAsUpEnabled(true);

        addControls();
        addEvents();
        fakeData();

    }

    private void fakeData() {

        kt5Adapter.add(new KT5( "Socola KiKat","Gói","42.000"));
        kt5Adapter.add(new KT5( "Kẹo dẻo Jelly Bean","Hộp","50.000"));
        kt5Adapter.add(new KT5( "Bánh kem Iceream Sandwich","Que","2.000"));
        kt5Adapter.add(new KT5( "Mật ông rừng HoneyComb","Hũ","60.000"));
        kt5Adapter.add(new KT5( "Bánh mì gừng GingerBread","Ổ","10.000"));





    }

    private void addEvents() {
        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                KT5 kt5 = kt5Adapter.getItem(i);
               // Toast.makeText(Listview5Activity.this, "Ban chon" + kt5.getTen1(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void addControls() {
        lvProduct = findViewById(R.id.lvProduct);
        kt5Adapter = new KT5Adapter(Listview5Activity.this, R.layout.item_product);
        lvProduct.setAdapter(kt5Adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                Toast.makeText(this, "Bạn vừa chọn menu 1", Toast.LENGTH_LONG).show();
                //code xử lý khi bấm menu1
                break;

            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}