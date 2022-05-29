package com.example.hobbify;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hobbify.adapter.RecentsAdapter;
import com.example.hobbify.adapter.TopPlacesAdapter;
import com.example.hobbify.model.RecentData;
import com.example.hobbify.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class TravelActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);


        List<RecentData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentData("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));
        recentsDataList.add(new RecentData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentData("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));
        recentsDataList.add(new RecentData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentData("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private void setRecentRecycler(List<RecentData> recentsDataList) {

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList) {

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }
}