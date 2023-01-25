package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityDatePickerBinding;

public class DatePickerActivity extends AppCompatActivity {

    ActivityDatePickerBinding datePickerBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        datePickerBinding = ActivityDatePickerBinding.inflate(getLayoutInflater());
        setContentView(datePickerBinding.getRoot());
        showDatePicker();
    }

    private void showDatePicker() {
        datePickerBinding.changeDateBtn.setOnClickListener(v -> {
            int month = datePickerBinding.datePickerDp.getMonth();
            int year = datePickerBinding.datePickerDp.getYear();
            int day = datePickerBinding.datePickerDp.getDayOfMonth();
            Toast.makeText(this, String.valueOf(day) + "/" + String.valueOf(month + 1) + "/" + String.valueOf(year), Toast.LENGTH_SHORT).show();
        });
    }
}