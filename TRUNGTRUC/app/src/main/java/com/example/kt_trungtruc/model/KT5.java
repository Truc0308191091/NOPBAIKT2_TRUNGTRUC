package com.example.kt_trungtruc.model;

import java.io.Serializable;

public class KT5 implements Serializable {
    private String Ten1;
    private String Loai1;
    private String Gia1;

    public KT5() {
    }

    public KT5(String ten1, String loai1, String gia1) {
        Ten1 = ten1;
        Loai1 = loai1;
        Gia1 = gia1;
    }

    public String getTen1() {
        return Ten1;
    }

    public void setTen1(String ten1) {
        Ten1 = ten1;
    }

    public String getLoai1() {
        return Loai1;
    }

    public void setLoai1(String loai1) {
        Loai1 = loai1;
    }

    public String getGia1() {
        return Gia1;
    }

    public void setGia1(String gia1) {
        Gia1 = gia1;
    }
}
