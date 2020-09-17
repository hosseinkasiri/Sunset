package com.example.sunset.controller;

import androidx.fragment.app.Fragment;

public class SunsetActivity extends SingleFragmentActivity{

    @Override
    public Fragment mFragment() {
        return SunsetFragment.newInstance();
    }
}