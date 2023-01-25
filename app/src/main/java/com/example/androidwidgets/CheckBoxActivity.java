package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {
    ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleOrderBtn();

    }

    private void handleOrderBtn() {
        binding.orderBtn.setOnClickListener(v -> {
            int totalAmount = 0;
            if(binding.pizzaCb.isChecked()) {
                totalAmount += 500;
            }
            if(binding.coffeeCb.isChecked()) {
                totalAmount += 50;
            }
            if(binding.sugarCb.isChecked()) {
                totalAmount += 250;
            }
            Toast.makeText(this, String.valueOf(totalAmount), Toast.LENGTH_SHORT).show();
        });
    }
}