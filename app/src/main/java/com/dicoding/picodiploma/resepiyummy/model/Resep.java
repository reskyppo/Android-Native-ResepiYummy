package com.dicoding.picodiploma.resepiyummy.model;

public class Resep {
    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    void setPhoto(int photo) {
        this.photo = photo;
    }



    private String name;
    private String detail;
    private int photo;

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getLangkah() {
        return langkah;
    }

    public void setLangkah(String langkah) {
        this.langkah = langkah;
    }

    private String bahan;
    private String langkah;
}
