package com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.FooterPanel;

import com.hoymm.root.airpollution_info.R;
import com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager.AppViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager.FragmentNames;

import static com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager.FragmentNames.INFO;
import static com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager.FragmentNames.LOCATION;
import static com.hoymm.root.airpollution_info.AppViewPagerAndFooterPanel.AppViewPager.FragmentNames.SEARCH;

/**
 * File created by Damian Muca - Kaizen on 05.09.17.
 */

public class FooterButtons {
    private ImageButton search, location, info;
    private AppCompatActivity activity;

    public FooterButtons(AppCompatActivity activity) {
        this.activity = activity;
    }

    public void initAndSetBehaviorOfFooterButtons(AppViewPager appViewPager) {
        init();
        setBehavior(appViewPager);
    }

    private void init() {
        search = (ImageButton) getActivity().findViewById(R.id.search);
        location = (ImageButton)  getActivity().findViewById(R.id.location);
        info = (ImageButton)  getActivity().findViewById(R.id.info);
    }

    private void setBehavior(AppViewPager appViewPager) {
        setSearchButtonBehavior(appViewPager);
        setLocationButtonBehavior(appViewPager);
        setInfoButtonBehavior(appViewPager);
    }

    private void setSearchButtonBehavior(final AppViewPager appViewPager){
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchButtonAction();
                appViewPager.moveToFragmentPage(SEARCH);
            }
        });

    }

    private void searchButtonAction() {
        activateArgumentButtonAndDeactivateOthers(SEARCH);
    }

    private void activateArgumentButtonAndDeactivateOthers(FragmentNames fragmentName) {
        deactivateAll();
        activateChoosenOne(fragmentName);
    }

    private void deactivateAll() {
        search.setActivated(false);
        location.setActivated(false);
        info.setActivated(false);
    }

    private void activateChoosenOne(FragmentNames fragmentName) {
        switch (fragmentName){
            case SEARCH:
                search.setActivated(true);
                break;
            case LOCATION:
                location.setActivated(true);
                break;
            case INFO:
                info.setActivated(true);
                break;
            default:
                break;
        }
    }

    private void setLocationButtonBehavior(final AppViewPager appViewPager){
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                locationButtonAction();
                appViewPager.moveToFragmentPage(LOCATION);
            }
        });
    }

    private void locationButtonAction() {
        activateArgumentButtonAndDeactivateOthers(LOCATION);
    }

    private void setInfoButtonBehavior(final AppViewPager appViewPager){
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoButtonAction();
                appViewPager.moveToFragmentPage(INFO);
            }
        });
    }

    private void infoButtonAction() {
        activateArgumentButtonAndDeactivateOthers(INFO);
    }

    private AppCompatActivity getActivity(){
        return activity;
    }
}
