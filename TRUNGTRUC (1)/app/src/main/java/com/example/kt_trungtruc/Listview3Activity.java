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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kt_trungtruc.model.Contact;

public class Listview3Activity extends AppCompatActivity {
    Intent i;
    EditText edtMa,edtTen,edtPhone;
    Button btnLuu;
    ListView lvContact;
    ArrayAdapter<Contact> contactAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview3);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView3");
        actionBar.setDisplayHomeAsUpEnabled(true);

        addControls();
        addEvents();


    }

    private void addEvents() {
        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(Listview3Activity.this, "Ban vua bam vao nut Luu", Toast.LENGTH_SHORT).show();
            xyLyThemContact();
            }
        });
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Contact c = contactAdapter.getItem(position);

                edtMa.setText(c.getId()+"");
                edtTen.setText(c.getName());
                edtPhone.setText(c.getPhone());

            }
        });

        lvContact.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
                Contact c = contactAdapter.getItem(position);
                contactAdapter.remove(c);


                return false;
            }
        });

    }

    private void xyLyThemContact() {
        Contact c= new Contact();
        c.setId(Integer.parseInt(edtMa.getText().toString()));
        c.setName(edtTen.getText().toString());
        c.setPhone(edtPhone.getText().toString());
        contactAdapter.add(c);



    }

    private void addControls() {
        edtMa= findViewById(R.id.edtMa);
        edtTen =findViewById(R.id.edtTen);
        edtPhone=findViewById(R.id.edtPhone);
        btnLuu=findViewById(R.id.btnLuu);
        lvContact=findViewById(R.id.lvContact);
        contactAdapter=new ArrayAdapter<Contact>(Listview3Activity.this, android.R.layout.simple_list_item_1);
        lvContact.setAdapter(contactAdapter);



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
                i = new Intent(Listview3Activity.this,MainActivity3.class);
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


}