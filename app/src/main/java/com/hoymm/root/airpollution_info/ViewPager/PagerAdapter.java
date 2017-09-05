package com.hoymm.root.airpollution_info.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * File created by Damian Muca - Kaizen on 05.09.17.
 */

class PagerAdapter extends FragmentPagerAdapter {

    PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SearchFragment();
            case 1:
                return new LocationFragment();
            case 2:
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
