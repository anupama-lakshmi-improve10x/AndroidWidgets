package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivitySpinnerBinding;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {
     private ActivitySpinnerBinding binding;
     private ArrayList<String> countryList;
     private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySpinnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupData();
        setUpSpinner();
    }

    private void setupData() {
        countryList = new ArrayList<>();
        countryList.add("India");
        countryList.add("USA");
        countryList.add("China");
        countryList.add("Japan");
        countryList.add("Russia");
    }

    private void setUpSpinner() {
        arrayAdapter = new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1,countryList);
        binding.spinnerViewSp.setAdapter(arrayAdapter);
        binding.spinnerViewSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SpinnerActivity.this, countryList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}