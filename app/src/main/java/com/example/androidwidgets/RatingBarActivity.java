package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityRatingBarBinding;

public class RatingBarActivity extends AppCompatActivity {

    ActivityRatingBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRatingBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showRatingBar();
    }

    public void showRatingBar() {
        binding.onSubmit.setOnClickListener(v -> {
            String rate =String.valueOf(binding.ratingbarRb.getRating());
            Toast.makeText(this, rate, Toast.LENGTH_SHORT).show();
        });
    }
}