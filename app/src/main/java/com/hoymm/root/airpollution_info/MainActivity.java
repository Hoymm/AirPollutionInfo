package com.hoymm.root.airpollution_info;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPagerAndFooterPanel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragmentViewPagerAndFooterPanel();
    }

    private void initFragmentViewPagerAndFooterPanel() {
        new AppViewPagerAndFooterPanel(this);
    }


}
