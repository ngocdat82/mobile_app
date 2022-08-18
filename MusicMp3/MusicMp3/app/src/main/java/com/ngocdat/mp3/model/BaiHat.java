package com.ngocdat.mp3.model;

import java.io.Serializable;

public class BaiHat implements Serializable {
    private String id, tenbaihat, theloai, casi, img, link, album;

    public BaiHat() {
    }


    public BaiHat(String id, String tenbaihat, String theloai, String casi, String img, String link, String album) {
        this.id = id;
        this.tenbaihat = tenbaihat;
        this.theloai = theloai;
        this.casi = casi;
        this.img = img;
        this.link = link;
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenbaihat() {
        return tenbaihat;
    }

    public void setTenbaihat(String tenbaihat) {
        this.tenbaihat = tenbaihat;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
