package com.example.kmj.viewpager_test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return BlankFragment.newInstance();
            case 1:return BlankFragment2.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
