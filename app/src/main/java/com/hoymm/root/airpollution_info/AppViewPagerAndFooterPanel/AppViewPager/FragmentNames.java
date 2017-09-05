package com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager;

import android.util.Log;

/**
 * File created by Damian Muca - Kaizen on 05.09.17.
 */

public enum FragmentNames {
    SEARCH, LOCATION, INFO;

    public static int enumToInt(FragmentNames page){
        switch (page){
            case SEARCH:
                return 0;
            case LOCATION:
                return 1;
            case INFO:
                return 2;
            default:
                return -1;
        }
    }

    public static FragmentNames intToEnum(int number){
        switch (number){
            case 0:
                return SEARCH;
            case 1:
                return LOCATION;
            case 2:
                return INFO;
            default:
                Log.e("FragmentNames class", "there is page of index " + number);
                return INFO;
        }
    }
}
