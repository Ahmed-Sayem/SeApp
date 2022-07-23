package com.example.seapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentSalesHistory extends Fragment {

    RecyclerView pointRecyclerView;
    List<PointRowModel> pointList;
    PointRowAdapter pointRowAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_history, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        pointRecyclerView = view.findViewById(R.id.sales_point_table);
        displayPointHistoryTable();

    }

    private void displayPointHistoryTable() {
        pointRecyclerView.setHasFixedSize(true);
        pointRecyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 1));

        pointList = new ArrayList<>();
        pointList.add(new PointRowModel("Date", "Name", "Status"));
        pointList.add(new PointRowModel("07-06-22", "Habib Store", "Pending"));
        pointList.add(new PointRowModel("02-07-22", "Kamal Store", "Approved"));
        pointList.add(new PointRowModel("30-06-22", "Jamal Store", "Approved"));
        pointList.add(new PointRowModel("30-06-22", "Ahsan Store", "Approved"));
        pointList.add(new PointRowModel("30-06-22", "Aman Store",  "Approved"));
        pointList.add(new PointRowModel("30-06-22", "Akash Store", "Approved"));


        pointRowAdapter = new PointRowAdapter(requireContext(), pointList, new PointRowAdapter.PointCallback() {
            @Override
            public void onSalesClicked(PointRowModel pointRowModel) {
                SalesDialog salesDialog = new SalesDialog();
                salesDialog.show(getChildFragmentManager(),"sales_dialog");
            }
        });
        pointRecyclerView.setAdapter(pointRowAdapter);
    }
}