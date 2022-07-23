package com.example.seapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {


    List<InventoryRowModel> inventoryList;
    RecyclerView inventoryRecyclerView;
    InventoryRowAdapter inventoryRowAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


        displayInventoryHistoryTable();
    }

    private void displayInventoryHistoryTable() {
        inventoryRecyclerView = findViewById(R.id.inventory_history_table);
        inventoryRecyclerView.setHasFixedSize(true);
        inventoryRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        inventoryList = new ArrayList<>();
        inventoryList.add(new InventoryRowModel("Date", "Name", "Product", "Quantity"));
        inventoryList.add(new InventoryRowModel("07-06-22", "Habib Store", "Product A", "20"));
        inventoryList.add(new InventoryRowModel("07-06-22", "Habib Store", "Product A", "20"));
        inventoryList.add(new InventoryRowModel("07-06-22", "Habib Store", "Product A", "20"));
        inventoryList.add(new InventoryRowModel("07-06-22", "Habib Store", "Product A", "20"));
        inventoryList.add(new InventoryRowModel("07-06-22", "Habib Store", "Product A", "20"));
        inventoryList.add(new InventoryRowModel("07-06-22", "Habib Store", "Product A", "20"));
        inventoryList.add(new InventoryRowModel("07-06-22", "Habib Store", "Product A", "20"));
        inventoryList.add(new InventoryRowModel("07-06-22", "Habib Store", "Product A", "20"));

        inventoryRowAdapter = new InventoryRowAdapter(this, inventoryList);
        inventoryRecyclerView.setAdapter(inventoryRowAdapter);
    }



}