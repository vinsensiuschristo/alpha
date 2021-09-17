package com.example.alpha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.alpha.Fragment.AboutFragment;
import com.example.alpha.Fragment.ActivityDownload;
import com.example.alpha.Fragment.ActivityHome;
import com.example.alpha.Fragment.ProfileFragment;
import com.example.alpha.Fragment.ReportActivity;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.nav_view);
        Toolbar toolbar = findViewById(R.id.toolbar);

        NavigationView navigationView = findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(this);
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment());
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,
                toolbar,
                R.string.navigation_draw_open,
                R.string.navigation_draw_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ProfileFragment()).commit();
                break;
            case R.id.about:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new AboutFragment()).commit();
                break;
            case R.id.home:
                Intent homeIntent = new Intent(this, ActivityHome.class);
                startActivity(homeIntent);
                break;
            case R.id.download:
                Intent downloadIntent = new Intent(this, ActivityDownload.class);
                startActivity(downloadIntent);
                break;
            case R.id.report:
                Intent reportIntent = new Intent(this, ReportActivity.class);
                startActivity(reportIntent);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}