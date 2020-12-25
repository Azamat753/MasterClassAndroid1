package com.lawlett.masterclassandroid1.ui.recycler_fragmen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lawlett.masterclassandroid1.R;
import com.lawlett.masterclassandroid1.ui.recycler_fragmen.adapter.StudentAdapter;

import java.util.ArrayList;
import java.util.List;

public class ResyclerFragment extends Fragment {

    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private GridLayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resycler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view);
        studentAdapter = new StudentAdapter();
        layoutManager = new GridLayoutManager(requireContext(), 2);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    public void addData(String string) {
        studentAdapter.addItem(string);
    }
}