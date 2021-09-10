package com.ithoughts.androidsamples.sample1.amessage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.ithoughts.androidsamples.sample1.amessage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    public static final int PAGES_COUNT = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        setSupportActionBar(mainBinding.toolbar);
        TabLayout tabs = mainBinding.tabs;
        ViewPager2 pages = mainBinding.pages;
        PagesAdapter pagesAdapter = new PagesAdapter(this);
        pages.setAdapter(pagesAdapter);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabs, pages,((tab, position) -> {
            switch (position){
                case 0 : tab.setText("Chats");break;
                case 1 : tab.setText("Groups");break;
                case 2 : tab.setText("Status");break;
                case 3 : tab.setText("Calls");break;
            }
        }));
        tabLayoutMediator.attach();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
}