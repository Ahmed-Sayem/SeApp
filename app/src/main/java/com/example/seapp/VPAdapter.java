package com.example.seapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPAdapter extends FragmentStateAdapter {
    int tabCount;

    public VPAdapter(@NonNull FragmentActivity fa, int tabCount) {
        super(fa);
        this.tabCount = tabCount;
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0){
            return new FragmentSalesHistory();
        }else if (position == 1){
            return new FragmentSalesPoint();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return tabCount;
    }
}
