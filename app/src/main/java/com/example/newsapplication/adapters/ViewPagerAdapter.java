package com.example.newsapplication.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.newsapplication.fragments.FavouritesFragment;
import com.example.newsapplication.fragments.StoriesFragment;
import com.example.newsapplication.fragments.VideoFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private int amountFragment = 3;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new StoriesFragment();
//                break;
            case 1:
                return new VideoFragment();
            case 2:
                return new FavouritesFragment();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "STORIES"/*mContext.getString(R.string.category_usefulinfo)*/;
            case 1:
                return "VIDEO"/*mContext.getString(R.string.category_places)*/;
            case 2:
                return "FAVOURITES"/*mContext.getString(R.string.category_food)*/;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return amountFragment;
    }
}
