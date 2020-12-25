package com.lawlett.masterclassandroid1.ui.form_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.lawlett.masterclassandroid1.IAddDataListener;
import com.lawlett.masterclassandroid1.R;
import com.lawlett.masterclassandroid1.ui.main.MainFragment;

public class FormFragment extends Fragment {

    EditText editText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_form, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = view.findViewById(R.id.bnt_add);
        editText = view.findViewById(R.id.edit_text_form);

        button.setOnClickListener(v -> {
            ((IAddDataListener) requireActivity()).addData(editText.getText().toString().trim());
        });
    }
}