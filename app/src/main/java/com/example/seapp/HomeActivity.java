package com.example.seapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Button createSalesPoint = (Button) findViewById(R.id.btnCreateSP);
        final Button manageInventory = (Button) findViewById(R.id.btnInventory);
        final Button attendance = (Button) findViewById(R.id.btnAttendance);
        final Button dashboard = (Button) findViewById(R.id.btnDashboard);


        createSalesPoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(HomeActivity.this, CreateSalesPointActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                HomeActivity.this.startActivity(activityChangeIntent);
            }
        });

        manageInventory.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(HomeActivity.this, InventoryActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                HomeActivity.this.startActivity(activityChangeIntent);
            }
        });

        attendance.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(HomeActivity.this, AttendanceActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                HomeActivity.this.startActivity(activityChangeIntent);
            }
        });

        dashboard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(HomeActivity.this, HistoryActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                HomeActivity.this.startActivity(activityChangeIntent);
            }
        });

    }
}