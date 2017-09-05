package com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager.Fragments.InfoFragment;
import com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager.Fragments.LocationFragment;
import com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager.Fragments.SearchFragment;

/**
 * File created by Damian Muca - Kaizen on 05.09.17.
 */

class PagerAdapter extends FragmentPagerAdapter {

    PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (FragmentNames.intToEnum(position)){
            case SEARCH:
                return new SearchFragment();
            case LOCATION:
                return new LocationFragment();
            case INFO:
                return new InfoFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
