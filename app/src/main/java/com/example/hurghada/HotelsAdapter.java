package com.example.hurghada;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HotelsAdapter extends RecyclerView.Adapter<HotelsAdapter.HotelViewHolder> {

    private ArrayList<Hotel> hotels;

    public HotelsAdapter(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }

    @Override
    public HotelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel_list_item, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HotelViewHolder holder, int position) {
        holder.bind(position);
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder {
        ImageView hotelImage;
        TextView hotelTitle, price, rating;
        RatingBar stars;

        HotelViewHolder(View itemView) {
            super(itemView);


            hotelImage = (ImageView)itemView.findViewById(R.id.hotel_image);
            hotelTitle = (TextView) itemView.findViewById(R.id.beach_name);
            price = (TextView) itemView.findViewById(R.id.price);
            rating = (TextView) itemView.findViewById(R.id.rating);
            stars = (RatingBar) itemView.findViewById(R.id.hotel_stars);
        }
        void bind(int position) {
            Hotel hotel = hotels.get(position);

            if (hotel.hasImage()) {
                hotelImage.setImageResource(hotel.getImageResourceId());
            }

            hotelTitle.setText(hotel.getHotelTitle());
            price.setText(hotel.getPrice()+"$/day");
            rating.setText(Float.toString(hotel.getRating()));
            stars.setNumStars(hotel.getNoOfStars());
        }

    }


}
