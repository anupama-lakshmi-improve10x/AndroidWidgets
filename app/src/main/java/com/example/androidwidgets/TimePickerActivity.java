package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityTimePickerBinding;

public class TimePickerActivity extends AppCompatActivity {

    ActivityTimePickerBinding timePickerBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        timePickerBinding = ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(timePickerBinding.getRoot());
        showTimePicker();
    }

    public void showTimePicker() {
        timePickerBinding.changeTimeBtn.setOnClickListener(v -> {
            int hour = timePickerBinding.timePicker.getCurrentHour();
            int minute = timePickerBinding.timePicker.getCurrentMinute();
            Toast.makeText(this, String.valueOf(hour) + ":" + String.valueOf(minute), Toast.LENGTH_SHORT).show();
        });
    }
}