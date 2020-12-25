package com.lawlett.masterclassandroid1.ui.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.lawlett.masterclassandroid1.ui.form_fragment.FormFragment;
import com.lawlett.masterclassandroid1.ui.recycler_fragmen.ResyclerFragment;

class MainViewPagerAdapter extends FragmentPagerAdapter {



    ResyclerFragment resyclerFragment = new ResyclerFragment();
    FormFragment formFragment = new FormFragment();

    public MainViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return resyclerFragment;

            case 1:
                return formFragment;

            default: return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    public void addDataToRecyclerFragment(String string) {
        resyclerFragment.addData(string);
    }
}
