package com.dicoding.picodiploma.resepiyummy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dicoding.picodiploma.resepiyummy.adapter.ListResepAdapter;
import com.dicoding.picodiploma.resepiyummy.adapter.about_me;
import com.dicoding.picodiploma.resepiyummy.model.Resep;
import com.dicoding.picodiploma.resepiyummy.model.ResepData;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  {
    private RecyclerView rvResep;
    private ArrayList<Resep> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvResep = findViewById(R.id.rv_resep);
        rvResep.setHasFixedSize(true);

        list.addAll(ResepData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvResep.setLayoutManager(new LinearLayoutManager(this));
        ListResepAdapter listResepAdapter = new ListResepAdapter(list);
        rvResep.setAdapter(listResepAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_about:
                Intent intent = new Intent(this, about_me.class);
                this.startActivity(intent);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
