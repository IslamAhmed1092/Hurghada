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
public class RestaurantsFragment extends Fragment {

    private RestaurantsAdapter adapter;
    private RecyclerView restaurantsList;
    private ArrayList<Restaurant> restaurants;

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_restaurants, container, false);

        restaurants = ((MainActivity)getActivity()).getRestaurants();

        restaurantsList = rootView.findViewById(R.id.rv_restaurants);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        restaurantsList.setLayoutManager(layoutManager);

        restaurantsList.setHasFixedSize(true);


        adapter = new RestaurantsAdapter(restaurants);
        restaurantsList.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(restaurantsList.getContext(),
                layoutManager.getOrientation());
        restaurantsList.addItemDecoration(dividerItemDecoration);

        return rootView;
    }

}
