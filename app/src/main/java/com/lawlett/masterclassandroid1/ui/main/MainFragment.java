package com.lawlett.masterclassandroid1.ui.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lawlett.masterclassandroid1.IAddDataListener;
import com.lawlett.masterclassandroid1.R;

public class MainFragment extends Fragment implements IAddDataListener {

    ViewPager viewPager;
    MainViewPagerAdapter mainViewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager = view.findViewById(R.id.view_pager);
        mainViewPagerAdapter = new MainViewPagerAdapter(getChildFragmentManager());

        viewPager.setAdapter(mainViewPagerAdapter);
    }

    @Override
    public void addData(String string) {
        mainViewPagerAdapter.addDataToRecyclerFragment(string);
    }
}