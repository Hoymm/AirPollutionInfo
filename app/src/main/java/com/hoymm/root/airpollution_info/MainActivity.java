package com.hoymm.root.airpollution_info;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hoymm.root.airpollution_info.ViewPager.FragmentViewsPager;

public class MainActivity extends AppCompatActivity {
    private FragmentViewsPager fragmentViewsPager;
    private FooterPanel footerPanel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragmentViewsPager();
        initFooterPanel();
    }

    private void initFragmentViewsPager() {
        fragmentViewsPager = new FragmentViewsPager(this);
    }

    private void initFooterPanel() {
        footerPanel = new FooterPanel(this);
    }


}
