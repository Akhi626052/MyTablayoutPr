package com.daizzyinfo.mytablayoutpr;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments = new ArrayList<Fragment>();
    ArrayList<String> titles = new ArrayList<String>();

//    ArrayList<String> getTitles =new ArrayList<String>();

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {

        super(fm, behavior);
    }

    @NonNull



    public Fragment getItem(int position) {

        return fragments.get(position);

    }


    @Override
    public int getCount() {

        return fragments.size();
    }
    @NonNull
    public void addfragment( Fragment fragment,String title) {
        fragments.add(fragment);
        titles.add(title);

//        getTitles.add(title);

    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0: {
                return "Today";

            }
            case 1: {
                return "Upcoming";
            }
            case 2: {

                return "Past";
            }
            default:
                return null;
        }
    }



}
