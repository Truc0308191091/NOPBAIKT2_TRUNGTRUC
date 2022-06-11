package com.example.kt_trungtruc;

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

public class Listview2Activity extends AppCompatActivity {
    Intent i;
    ListView ListViewData2;
    String []arrData2;
    ArrayAdapter<String>adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView2");
        actionBar.setDisplayHomeAsUpEnabled(true);
        addControls();
        addtvents();
    }private void
    addtvents() {
        ListViewData2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Listview2Activity.this, "Bạn vừa chọn " + arrData2[position], Toast.LENGTH_LONG).show();
            }
        });
    }


    private void addControls() {
        ListViewData2=findViewById(R.id.ListViewData2);
        arrData2=getResources().getStringArray(R.array.myArray);
        adapter2=new ArrayAdapter<String>(Listview2Activity.this, android.R.layout.simple_list_item_1,arrData2);
        ListViewData2.setAdapter(adapter2);
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
                i = new Intent(Listview2Activity.this, MainActivity4.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            case R.id.menu4:
                i = new Intent(Listview2Activity.this, MainActivity5.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
}