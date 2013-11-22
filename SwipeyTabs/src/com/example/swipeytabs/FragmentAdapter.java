package com.example.swipeytabs;

import com.viewpagerindicator.IconPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter{

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getIconResId(int index) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Fragment getItem(int position) 
    {
        // TODO Auto-generated method stub
        Fragment fragment = new FirstActivity();
        switch(position){
        case 0:
            fragment = new FirstActivity();
            break;
        case 1:
            fragment = new SecondActivity();
            break;
        case 2:
            fragment = new ThirdActivity();
            break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3;
    }
    
    @Override
    public CharSequence getPageTitle(int position){
        String title = "";
        switch(position){
        case 0:
            title = "First Fragment";
            break;
        case 1:
            title = "Second Fragment";
            break;
        case 2:
            title = "Third Fragment";
            break;
        }
        return title;
    }

}