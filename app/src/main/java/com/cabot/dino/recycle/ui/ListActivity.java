package com.cabot.dino.recycle.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cabot.dino.recycle.R;
import com.cabot.dino.recycle.adapter.DummyAdapter;
import com.cabot.dino.recycle.model.DummyData;

public class ListActivity extends AppCompatActivity {
    private RecyclerView recView;
    private DummyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recView = (RecyclerView)findViewById(R.id.rec_list);
        //Check out GridLayoutManager and StaggeredGridLayoutManager for more options
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new DummyAdapter(DummyData.getListData(), this);
        recView.setAdapter(adapter);
    }
}


