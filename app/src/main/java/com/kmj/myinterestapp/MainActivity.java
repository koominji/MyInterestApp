package com.kmj.myinterestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("TAG1").setIndicator("고양이");
        tabSpec1.setContent(R.id.linear1);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("TAG2").setIndicator("주식");
        tabSpec2.setContent(R.id.linear2);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("TAG3").setIndicator("블로그");
        tabSpec3.setContent(R.id.linear3);
        tabHost.addTab(tabSpec3);

        TabHost.TabSpec tabSpec4 = tabHost.newTabSpec("TAG4").setIndicator("베이킹");
        tabSpec4.setContent(R.id.linear4);
        tabHost.addTab(tabSpec4);


        tabHost.setCurrentTab(0);
    }
}