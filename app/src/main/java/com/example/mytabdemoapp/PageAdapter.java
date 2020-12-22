package com.example.mytabdemoapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    int tabcount;
    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            //code to be added later
            case 0: return new FragmentTab1();
            case 1: return new FragmentTab2();
            case 2: return new FragmentTab3();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
