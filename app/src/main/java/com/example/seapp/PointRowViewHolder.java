package com.example.seapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PointRowViewHolder extends RecyclerView.ViewHolder {

    public TextView point_date, point_name, point_status;

    public PointRowViewHolder(@NonNull View itemView) {
        super(itemView);
        point_date = itemView.findViewById(R.id.point_date);
        point_name = itemView.findViewById(R.id.point_name);
        point_status = itemView.findViewById(R.id.point_status);
    }
}
