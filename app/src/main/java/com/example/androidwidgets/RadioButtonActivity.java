package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityRadioButtonBinding;

public class RadioButtonActivity extends AppCompatActivity {

    ActivityRadioButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRadioButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showRadioButton();
    }

    private void showRadioButton() {
        binding.selectedBtn.setOnClickListener(v -> {
            if(binding.femaleRg.isChecked()) {
                Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
            } else if (binding.maleRg.isChecked()) {
                Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
            }
        });
    }
}