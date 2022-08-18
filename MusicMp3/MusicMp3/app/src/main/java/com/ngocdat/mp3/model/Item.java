package com.ngocdat.mp3.model;

import java.io.Serializable;

public class Item implements Serializable {
    private String loai, img;

    public Item() {
    }

    public Item(String loai, String img) {
        this.loai = loai;
        this.img = img;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
