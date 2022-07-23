package com.example.seapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

public class InventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);


        String[] salesItem = new String[] { "Karim Store", "Jasim Store", "Aman Store" };

        ArrayAdapter<String> salesAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, salesItem);

        String[] productItem = new String[] { "Chai Latte", "Green Tea", "Black Tea" };

        ArrayAdapter<String> productItemAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, productItem);

        AutoCompleteTextView salesPoint = findViewById(R.id.sales_spinner);
        salesPoint.setAdapter(salesAdapter);

        AutoCompleteTextView product = findViewById(R.id.product_spinner);
        product.setAdapter(productItemAdapter);

    }
}