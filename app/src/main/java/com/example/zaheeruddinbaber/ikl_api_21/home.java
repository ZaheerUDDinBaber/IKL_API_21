package com.example.zaheeruddinbaber.ikl_api_21;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    // fragments veriables for switching main screen
       private Fragment_IKL_Home frag_home = new Fragment_IKL_Home();
       private Fragment_IKL_Explore frag_exp = new Fragment_IKL_Explore();
       private Fragment_IKL frag_ikl = new Fragment_IKL();
       private Fragment_IKL_Website frag_web = new Fragment_IKL_Website();
       private Fragment_IKL_About frag_about = new Fragment_IKL_About();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    } // on create button closing

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    } // on back pressed button closing


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            switchFragment(frag_home);
        } else if (id == R.id.nav_exp) {
            switchFragment(frag_exp);
        } else if (id == R.id.nav_ikl) {
            switchFragment(frag_ikl);
        } else if (id == R.id.nav_web) {
            switchFragment(frag_web);
        } else if (id == R.id.nav_about) {
            switchFragment(frag_about);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    } // on navigation button click function closing

    public void switchFragment(Fragment recFrag){
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_switch_layout, recFrag).commit();
    }



} // main home class closing
