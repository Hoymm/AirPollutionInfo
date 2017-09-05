package com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;

import com.hoymm.root.airpollution_info.R;

/**
 * File created by Damian Muca - Kaizen on 05.09.17.
 */

public class AppViewPager {
    private AppCompatActivity activity;
    private android.support.v4.view.ViewPager viewPager;

    public AppViewPager(AppCompatActivity activity) {
        this.activity = activity;
        initViewPagerAndSetAdapter();
    }

    private void initViewPagerAndSetAdapter() {
        viewPager = (android.support.v4.view.ViewPager) getActivity().findViewById(R.id.mainViewPager);
        viewPager.setAdapter(new PagerAdapter(getActivity().getSupportFragmentManager()));
    }

    private AppCompatActivity getActivity(){
        return activity;
    }

    public void moveToFragmentPage(FragmentNames fragmentName){
        viewPager.setCurrentItem(FragmentNames.enumToInt(fragmentName), true);
    }


}
