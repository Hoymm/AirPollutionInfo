package com.hoymm.root.airpollution_info.ViewPager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.hoymm.root.airpollution_info.R;

/**
 * File created by Damian Muca - Kaizen on 05.09.17.
 */

public class FragmentViewsPager {
    private AppCompatActivity activity;
    private ViewPager viewPager;

    public FragmentViewsPager(AppCompatActivity activity) {
        this.activity = activity;
        initViewPagerAndSetAdapter();
    }

    private void initViewPagerAndSetAdapter() {
        viewPager = (ViewPager) getActivity().findViewById(R.id.mainViewPager);
        viewPager.setAdapter(new PagerAdapter(getActivity().getSupportFragmentManager()));
    }

    private AppCompatActivity getActivity(){
        return activity;
    }
}
