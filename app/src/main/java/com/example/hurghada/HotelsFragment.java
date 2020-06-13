package com.example.hurghada;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    private HotelsAdapter adapter;
    private RecyclerView hotelsList;
    private ArrayList<Hotel> hotels;

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_hotels, container, false);

        hotels = ((MainActivity)getActivity()).getHotels();

        hotelsList = rootView.findViewById(R.id.rv_hotels);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        hotelsList.setLayoutManager(layoutManager);

        hotelsList.setHasFixedSize(true);


        adapter = new HotelsAdapter(hotels);
        hotelsList.setAdapter(adapter);

        return rootView;
    }

}
