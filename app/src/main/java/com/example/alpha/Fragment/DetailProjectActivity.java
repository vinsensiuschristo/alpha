package com.example.alpha.Fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.alpha.R;

public class DetailProjectActivity extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    ListView listViewData;
    String[] arrayPeliculas = {"Project Example 1","Project Example 2","Project Example 3","Project Example 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_project);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice,arrayPeliculas);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_download,menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    //fungsi ngitung ceklis
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id  = item.getItemId();
//        if (id == R.id.item_done){
//            String  itemSelected = "Selected items: \n";
//            for (int i=0;i<listViewData.getCount();i++){
//                if (listViewData.isItemChecked(i)){
//                    itemSelected += listViewData.getItemAtPosition(i) + "\n";
//                }
//            }
//            Toast.makeText(this,itemSelected,Toast.LENGTH_SHORT).show();
//        }
//        return super.onOptionsItemSelected(item);
//    }


}