package com.dicoding.picodiploma.resepiyummy;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class Detail extends AppCompatActivity {
    public static final String nama = "nama";
    public static final String detail = "detail";
    public static final String bahan = "bahan";
    public static final String langkah = "langkah";
    public static final String gambar = "gambar";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry_detail);


        TextView tvName = findViewById(R.id.tvJudul_entry);
        String getNama = getIntent().getStringExtra(nama);
        tvName.setText(getNama);

        TextView tvDetail = findViewById(R.id.tvDetail_entry);
        String getDetail = getIntent().getStringExtra(detail);
        tvDetail.setText(getDetail);

        TextView tvBahan = findViewById(R.id.tvBahan_entry);
        String getBahan = getIntent().getStringExtra(bahan);
        tvBahan.setText(getBahan);

        TextView tvLangkah = findViewById(R.id.tvLangkah_entry);
        String getLangkah = getIntent().getStringExtra(langkah);
        tvLangkah.setText(getLangkah);

        ImageView ivImage = findViewById(R.id.Image_entry);
        int getImage = getIntent().getIntExtra(gambar,0);
        Glide.with(this)
                .load(getImage)
                .apply(new RequestOptions().override(410,400))
                .into(ivImage);
    }
}