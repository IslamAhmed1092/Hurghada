package com.example.hurghada;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ActivitiesAdapter extends RecyclerView.Adapter<ActivitiesAdapter.ActivityViewHolder> {

    private ArrayList<Activity> activities;

    public ActivitiesAdapter(ArrayList<Activity> activities) {
        this.activities = activities;
    }

    @Override
    public int getItemCount() {
        return activities.size();
    }

    @Override
    public ActivityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_item, parent, false);
        return new ActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ActivityViewHolder holder, int position) {
        holder.bind(position);
    }

    public class ActivityViewHolder extends RecyclerView.ViewHolder {
        ImageView activityImage;
        TextView activityDescription;

        ActivityViewHolder(View itemView) {
            super(itemView);


            activityImage = (ImageView)itemView.findViewById(R.id.activity_image);
            activityDescription = (TextView) itemView.findViewById(R.id.activity);

        }
        void bind(int position) {
            Activity activity = activities.get(position);

            if (activity.hasImage()) {
                activityImage.setImageResource(activity.getImageResourceId());
            }

            activityDescription.setText(activity.getActivity());

        }

    }


}
