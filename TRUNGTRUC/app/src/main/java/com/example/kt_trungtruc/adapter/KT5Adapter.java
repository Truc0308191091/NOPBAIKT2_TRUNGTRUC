package com.example.kt_trungtruc.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.kt_trungtruc.R;
import com.example.kt_trungtruc.model.KT5;

public class KT5Adapter extends ArrayAdapter<KT5> {
Activity context;
int resource;
public KT5Adapter(Activity context,int resource){
    super(context,resource);
    this.context=context;
    this.resource=resource;

}

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View customView=inflater.inflate(this.resource,null);

        TextView txtTen1= customView.findViewById(R.id.txtTen1);
        TextView txtLoai1= customView.findViewById(R.id.txtLoai1);
        TextView txtGia1= customView.findViewById(R.id.txtGia1);

        KT5 kt5=getItem(position);

        txtTen1.setText(kt5.getTen1());
        txtLoai1.setText(kt5.getLoai1());
        txtGia1.setText(kt5.getGia1()+" VNĐ");

        return customView;
    }

}
