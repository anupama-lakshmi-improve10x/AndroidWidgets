package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;

import com.example.androidwidgets.databinding.ActivityImageSliderBinding;
import com.example.androidwidgets.databinding.ActivityImageSwitcherBinding;

public class ImageSliderActivity extends AppCompatActivity {

    private ActivityImageSliderBinding binding;
    private ImageSliderAdapter imageSliderAdapter = new ImageSliderAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSliderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showImageSlider();
    }

    private void showImageSlider() {
        binding.imageSliderImg.setAdapter(imageSliderAdapter);
    }
}