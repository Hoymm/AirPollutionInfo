package com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel;

import android.support.v7.app.AppCompatActivity;

import com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager.AppViewPager;
import com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.FooterPanel.FooterButtons;

/**
 * File created by Damian Muca - Kaizen on 04.09.17.
 */

public class AppViewPagerAndFooterPanel {
    private AppCompatActivity activity;
    private AppViewPager appViewPager;

    public AppViewPagerAndFooterPanel(AppCompatActivity activity) {
        this.activity = activity;
        initViewsPager();
        initAndSetBehaviorButtons();
    }

    private void initViewsPager() {
        appViewPager = new AppViewPager(activity);
    }

    private void initAndSetBehaviorButtons(){
        FooterButtons footerButtons = new FooterButtons(getActivity());
        footerButtons.initAndSetBehaviorOfFooterButtons(appViewPager);

    }

    private AppCompatActivity getActivity(){
        return activity;
    }
}
