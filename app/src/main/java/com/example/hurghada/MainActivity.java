package com.example.hurghada;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Beach> beaches;
    ArrayList<Restaurant> restaurants;
    ArrayList<Hotel> hotels;
    ArrayList<Activity> activities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        tabs.getTabAt(0).setIcon(R.drawable.ic_pool_24dp);
        tabs.getTabAt(0).setText(R.string.tab_beaches);
        tabs.getTabAt(1).setIcon(R.drawable.ic_restaurant_24dp);
        tabs.getTabAt(1).setText(R.string.tab_restaurants);
        tabs.getTabAt(2).setIcon(R.drawable.ic_hotel_24dp);
        tabs.getTabAt(2).setText(R.string.tab_hotels);
        tabs.getTabAt(3).setIcon(R.drawable.ic_local_activity_24dp);
        tabs.getTabAt(3).setText(R.string.tab_activities);

        beaches = new ArrayList<Beach>();
        beaches.add(new Beach(R.drawable.elsawaky_beach, getString(R.string.elsawaky_beach), getString(R.string.elsawaky_beach_description)));
        beaches.add(new Beach(R.drawable.orange_beach, getString(R.string.orange_beach), getString(R.string.orange_beach_description)));
        beaches.add(new Beach(R.drawable.sahl_hasheesh_beach, getString(R.string.sahl_hasheesh_beach), getString(R.string.sahl_hasheesh_beach_description)));
        beaches.add(new Beach(R.drawable.makadi_bay, getString(R.string.makadi_bay), getString(R.string.makadi_bay_description)));
        beaches.add(new Beach(R.drawable.soma_bay, getString(R.string.soma_bay), getString(R.string.soma_bay_description)));
        beaches.add(new Beach(R.drawable.gifston_island, getString(R.string.gifton_island), getString(R.string.gifton_island_description)));
        beaches.add(new Beach(R.drawable.old_vic_beach, getString(R.string.old_vic_beach), getString(R.string.old_vic_beach_description)));
        beaches.add(new Beach(R.drawable.mahmya_beach, getString(R.string.mahmya_beach), getString(R.string.mahmya_beach_description)));
        beaches.add(new Beach(R.drawable.the_smokery_beach, getString(R.string.the_smokery_beach), getString(R.string.the_smokery_beach_description)));
        beaches.add(new Beach(R.drawable.public_beach_number_9, getString(R.string.public_beach_number_9), getString(R.string.public_beach_number_9_description)));

        restaurants = new ArrayList<Restaurant>();
        restaurants.add(new Restaurant(R.drawable.sofra, getString(R.string.sofra), getString(R.string.sofra_type), 5.0f));
        restaurants.add(new Restaurant(R.drawable.nino, getString(R.string.nino), getString(R.string.nino_type), 4.0f));
        restaurants.add(new Restaurant(R.drawable.makai_tukai, getString(R.string.makai_tukai), getString(R.string.makai_type), 2.5f));
        restaurants.add(new Restaurant(R.drawable.the_grill, getString(R.string.the_grill), getString(R.string.the_grill_type), 3.5f));
        restaurants.add(new Restaurant(R.drawable.the_greek, getString(R.string.the_greek), getString(R.string.the_greek_type), 4.0f));
        restaurants.add(new Restaurant(R.drawable.moby_dick, getString(R.string.moby_dick), getString(R.string.moby_dick_type), 3.0f));
        restaurants.add(new Restaurant(R.drawable.the_moon_restaurant, getString(R.string.the_moon), getString(R.string.the_moon_type), 5.0f));
        restaurants.add(new Restaurant(R.drawable.kahramana_restaurant, getString(R.string.kahramana), getString(R.string.kahramana_type), 2.0f));
        restaurants.add(new Restaurant(R.drawable.chuchichaschtli, getString(R.string.chuchi), getString(R.string.chuchi_type), 2.5f));
        restaurants.add(new Restaurant(R.drawable.grill_chill, getString(R.string.grill_and_chill), getString(R.string.grill_chill_type), 1.0f));

        hotels = new ArrayList<Hotel>();
        hotels.add(new Hotel(R.drawable.elgouna_abu_tig, getString(R.string.elgouna_abu_tig), 130, 9.8f, 4));
        hotels.add(new Hotel(R.drawable.labranda_royal_makadi, getString(R.string.labranda_royal), 89, 8.3f, 5));
        hotels.add(new Hotel(R.drawable.jaz_makadi_oasis_resort, getString(R.string.jaz_makadi), 99, 9.3f, 5));
        hotels.add(new Hotel(R.drawable.hurghada_dreams, getString(R.string.hurghada_dreams), 14, 7.4f, 3));
        hotels.add(new Hotel(R.drawable.solymar_ivory_suites, getString(R.string.solymar_ivory), 32, 8.4f, 4));
        hotels.add(new Hotel(R.drawable.hurghada_marriott_beach_resort, getString(R.string.marriott_beach_resort), 70, 8.9f, 5));
        hotels.add(new Hotel(R.drawable.minamark_beach_resort, getString(R.string.minamark_beach_resort), 30, 7.4f, 4));
        hotels.add(new Hotel(R.drawable.labranda_club, getString(R.string.labranda_club), 146, 9.1f, 4));
        hotels.add(new Hotel(R.drawable.baron_palace, getString(R.string.baron_palace), 140, 9.1f, 5));
        hotels.add(new Hotel(R.drawable.lberotel_makadi, getString(R.string.ibrote_makadi), 149, 9.5f, 5));

        activities = new ArrayList<Activity>();
        activities.add(new Activity(R.drawable.safari, getString(R.string.safari)));
        activities.add(new Activity(R.drawable.snorkeling, getString(R.string.snorkeling)));
        activities.add(new Activity(R.drawable.scuba_diving, getString(R.string.scuba_diving)));
        activities.add(new Activity(R.drawable.camel_trip, getString(R.string.camel_ride)));
        activities.add(new Activity(R.drawable.parasailing, getString(R.string.parasailing)));
        activities.add(new Activity(R.drawable.dolphin_show, getString(R.string.dolphin_show)));
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public ArrayList<Beach> getBeaches() {
        return beaches;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}