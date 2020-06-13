package com.example.hurghada;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        switch (position){
            case 0:
                return new BeachesFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new ActivitiesFragment();
            default:
                return new BeachesFragment();
        }
    }

    @Override
    public int getCount() {

        return 4;
    }
}