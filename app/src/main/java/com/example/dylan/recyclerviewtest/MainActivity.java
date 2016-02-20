package com.example.dylan.recyclerviewtest;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    //initialize arrays with no known size
    private String[] country = {"india1", "japan2","india3", "japan4","india5", "japan6","india7", "japan8","india9", "japan10","india11", "japan12","india", "japan","india", "japan","india", "japan","india", "japan","india", "japan","india", "japan","india", "japan","india", "japan","india", "japan"};
    private String[] capital = {"delhi1", "tokyo2","india3", "japan4","india5", "japan6","india7", "japan8","india9", "japan10","india11", "japan12","india", "japan","india", "japan","india", "japan","india", "japan","india", "japan","india", "japan","india", "japan","india", "japan","india", "japan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        int current;
        //iterate every 10 items and populate the
        for(current=0; current<country.length; current++){
            adapter = new RecyclerAdapter(country, capital);
            current+=10;
        }

        //populate view
        //adapter = new RecyclerAdapter(country, capital);


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setOnScrollListener(new EndlessRecyclerOnScrollListener((LinearLayoutManager) layoutManager) {
            @Override
            public void onLoadMore(int current_page) {
                //query another 10 items and populate???
                Log.i("loading more","test");
            }
        });
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}

