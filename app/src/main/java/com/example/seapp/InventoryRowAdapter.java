package com.example.seapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InventoryRowAdapter extends RecyclerView.Adapter<InventoryRowViewHolder> {
    private Context context;
    private List<InventoryRowModel> inventoryList;

    public InventoryRowAdapter(Context context, List<InventoryRowModel> inventoryList) {
        this.context = context;
        this.inventoryList = inventoryList;
    }

    @NonNull
    @Override
    public InventoryRowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InventoryRowViewHolder(LayoutInflater.from(context).inflate(R.layout.inventory_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull InventoryRowViewHolder holder, int position) {
        holder.point_date.setText(inventoryList.get(position).getDate());
        holder.point_name.setText(inventoryList.get(position).getName());
        holder.product.setText(inventoryList.get(position).getProduct());
        holder.quantity.setText(inventoryList.get(position).getQuantity());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return inventoryList.size();
    }

}
