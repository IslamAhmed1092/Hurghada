package com.example.hurghada;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BeachesFragment extends Fragment {

    private BeachesAdapter adapter;
    private RecyclerView beachesList;
    private ArrayList<Beach> beaches;
    
    public BeachesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_beaches, container, false);

        beaches = ((MainActivity)getActivity()).getBeaches();

        beachesList = rootView.findViewById(R.id.rv_beaches);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        beachesList.setLayoutManager(layoutManager);

        beachesList.setHasFixedSize(true);


        adapter = new BeachesAdapter(beaches);
        beachesList.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(beachesList.getContext(),
                layoutManager.getOrientation());
        beachesList.addItemDecoration(dividerItemDecoration);


        return rootView;
    }

}
