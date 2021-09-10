package com.example.alpha.Fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alpha.Data.Hero;
import com.example.alpha.Data.HeroesData;
import com.example.alpha.Data.ListHeroAdapter;
import com.example.alpha.R;

import java.util.ArrayList;

public class ActivityHome extends AppCompatActivity {
    Button btnDetail,btnUpdate;
    ProgressDialog progressDialog;

    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);
        btnUpdate = findViewById(R.id.btnUpdate);

        list.addAll(HeroesData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter = new ListHeroAdapter(list);
        rvHeroes.setAdapter(listHeroAdapter);
    }
}