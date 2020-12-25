package com.lawlett.masterclassandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lawlett.masterclassandroid1.ui.form_fragment.FormFragment;
import com.lawlett.masterclassandroid1.ui.recycler_fragmen.IUpdateDataListener;
import com.lawlett.masterclassandroid1.ui.recycler_fragmen.ResyclerFragment;

public class MainActivity extends AppCompatActivity implements IAddDataListener, IUpdateDataListener {

    ResyclerFragment resyclerFragment = new ResyclerFragment();
    FormFragment formFragment = new FormFragment();
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, formFragment)
                .commit();
    }

    @Override
    public void addData(String string) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, resyclerFragment)
                .commit();

        name = string;
    }

    @Override
    public void update() {
        resyclerFragment.addData(name);
    }
}