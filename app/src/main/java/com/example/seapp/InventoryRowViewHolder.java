package com.example.seapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class InventoryRowViewHolder extends RecyclerView.ViewHolder {

    public TextView point_date, point_name, product, quantity;

    public InventoryRowViewHolder(@NonNull View itemView) {
        super(itemView);
        point_date = itemView.findViewById(R.id.point_date);
        point_name = itemView.findViewById(R.id.point_name);
        product = itemView.findViewById(R.id.product_name);
        quantity = itemView.findViewById(R.id.product_quantity);
    }
}
