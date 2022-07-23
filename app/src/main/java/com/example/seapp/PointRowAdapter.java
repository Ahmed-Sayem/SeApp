package com.example.seapp;

import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PointRowAdapter extends RecyclerView.Adapter<PointRowViewHolder> {
    private Context context;
    private List<PointRowModel> pointList;
    private PointCallback callback;

    public PointRowAdapter(Context context, List<PointRowModel> pointList, PointCallback callback) {
        this.context = context;
        this.pointList = pointList;
        this.callback = callback;
    }

    @NonNull
    @Override
    public PointRowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PointRowViewHolder(LayoutInflater.from(context).inflate(R.layout.point_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PointRowViewHolder holder, int position) {
        holder.point_date.setText(pointList.get(position).getDate());
        holder.point_name.setText(pointList.get(position).getName());
        holder.point_status.setText(pointList.get(position).getStatus());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(position);
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(callback != null)
                    callback.onSalesClicked(pointList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return pointList.size();
    }

    interface PointCallback{
        public void onSalesClicked(PointRowModel pointRowModel);
    }

}
