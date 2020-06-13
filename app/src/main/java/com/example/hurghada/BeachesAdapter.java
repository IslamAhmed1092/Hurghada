package com.example.hurghada;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BeachesAdapter extends RecyclerView.Adapter<BeachesAdapter.BeachViewHolder> {

    private ArrayList<Beach> beaches;

    public BeachesAdapter(ArrayList<Beach> beaches) {
        this.beaches = beaches;
    }

    @Override
    public int getItemCount() {
        return beaches.size();
    }

    @Override
    public BeachViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.beach_list_item, parent, false);
        return new BeachViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BeachViewHolder holder, int position) {
        holder.bind(position);
    }

    public class BeachViewHolder extends RecyclerView.ViewHolder {
        ImageView beachImage;
        TextView beachName, description;

        BeachViewHolder(View itemView) {
            super(itemView);


            beachImage = (ImageView)itemView.findViewById(R.id.beach_image);
            beachName = (TextView) itemView.findViewById(R.id.beach_name);
            description = (TextView) itemView.findViewById(R.id.description);

        }
        void bind(int position) {
            Beach beach = beaches.get(position);

            if (beach.hasImage()) {
                beachImage.setImageResource(beach.getImageResourceId());
            }

            beachName.setText(beach.getBeachName());
            description.setText(beach.getDescription());

        }

    }


}
