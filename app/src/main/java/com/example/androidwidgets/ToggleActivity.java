package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.androidwidgets.databinding.ActivityToggleBinding;

public class ToggleActivity extends AppCompatActivity {

    ActivityToggleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToggleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleSubmitBtn();
    }

    private void handleSubmitBtn() {
        binding.submitBtn.setOnClickListener(v -> {
            String toggleOn = binding.toggleOnBtn.getText().toString();
            String toggleOff = binding.toggleOffBtn.getText().toString();
            Toast.makeText(this, toggleOn + "\n" + toggleOff , Toast.LENGTH_SHORT).show();
        });
    }
}