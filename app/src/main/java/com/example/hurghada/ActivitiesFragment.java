package com.example.hurghada;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ActivitiesFragment extends Fragment {

    private ActivitiesAdapter adapter;
    private RecyclerView activityList;
    private ArrayList<Activity> activities;
    
    public ActivitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_activities, container, false);

        activities = ((MainActivity)getActivity()).getActivities();

        activityList = rootView.findViewById(R.id.rv_activities);


        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        activityList.setLayoutManager(layoutManager);

        activityList.setHasFixedSize(true);


        adapter = new ActivitiesAdapter(activities);
        activityList.setAdapter(adapter);

        return rootView;
    }

}
