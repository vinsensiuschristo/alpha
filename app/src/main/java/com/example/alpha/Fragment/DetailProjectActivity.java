package com.example.alpha.Fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.alpha.R;

public class DetailProjectActivity extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    Button saveEnum;
    ImageView imageView;
    String[] arrayPeliculas = {"Project Example 1","Project Example 2","Project Example 3","Project Example 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_project);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice,arrayPeliculas);
    }

    //munculin menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail_activity_menu,menu);
//        return true;
        return super.onCreateOptionsMenu(menu);
    }

    //onclickItem Menu
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle item selection
//        switch (item.getItemId()) {
//            case R.id.item_done:
//                showDialog();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }

    //fungsi onClickItem Menu
    void showDialog(){
        final Dialog dialog = new Dialog(DetailProjectActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        //the user will be able to cancel the dialog
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.setting_enumerator);
//        Toast.makeText(getApplicationContext(), "This is my Toast message!",Toast.LENGTH_LONG).show();

        dialog.show();
    }


}