package com.example.hurghada;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.RestaurantViewHolder> {

    private ArrayList<Restaurant> restaurants;

    public RestaurantsAdapter(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    @Override
    public RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_item, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        holder.bind(position);
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {
        ImageView restaurantImage;
        TextView restaurantTitle, foodType;
        RatingBar rating;

        RestaurantViewHolder(View itemView) {
            super(itemView);


            restaurantImage = (ImageView)itemView.findViewById(R.id.restaurant_image);

            restaurantTitle = (TextView) itemView.findViewById(R.id.restaurant_title);
            foodType = (TextView) itemView.findViewById(R.id.food_type);
            rating = (RatingBar) itemView.findViewById(R.id.hotel_stars);
        }
        void bind(int position) {
            Restaurant restaurant = restaurants.get(position);

            if (restaurant.hasImage()) {
                restaurantImage.setImageResource(restaurant.getImageResourceId());
            }

            restaurantTitle.setText(restaurant.getRestaurantTitle());
            foodType.setText(restaurant.getFoodType());
            rating.setRating(restaurant.getRating());

        }

    }


}
