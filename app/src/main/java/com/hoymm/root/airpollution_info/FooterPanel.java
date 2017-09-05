package com.hoymm.root.airpollution_info;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * File created by Damian Muca - Kaizen on 04.09.17.
 */

public class FooterPanel {
    private ImageButton search, location, info;
    private AppCompatActivity activity;

    public FooterPanel(AppCompatActivity activity) {
        this.activity = activity;
        initButtons();
        setButtonsBehavior();
    }

    private void initButtons() {
        search = (ImageButton) getActivity().findViewById(R.id.search);
        location = (ImageButton)  getActivity().findViewById(R.id.location);
        info = (ImageButton)  getActivity().findViewById(R.id.info);
    }

    private void setButtonsBehavior() {
        initSearchButton();
        initLocationButton();
        initInfoButton();
    }

    private void initSearchButton(){
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search.setActivated(true);
                location.setActivated(false);
                info.setActivated(false);
            }
        });
    }

    private void initLocationButton(){
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search.setActivated(false);
                location.setActivated(true);
                info.setActivated(false);
            }
        });
    }

    private void initInfoButton(){
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search.setActivated(false);
                location.setActivated(false);
                info.setActivated(true);
            }
        });
    }

    private AppCompatActivity getActivity(){
        return activity;
    }
}
