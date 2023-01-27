package com.example.androidwidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.example.androidwidgets.databinding.ActivityImageSwitcherBinding;

public class ImageSwitcherActivity extends AppCompatActivity {

    ActivityImageSwitcherBinding binding;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSwitcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleImageSwitcher();
        handleNextBtn();
    }

    private void handleImageSwitcher() {
        binding.imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,
                        ActionBar.LayoutParams.MATCH_PARENT));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(R.drawable.img);
                return imageView;
            }
        });
    }

    private void handleNextBtn() {
        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        binding.imageSwitcher.setOutAnimation(aniOut);
        binding.imageSwitcher.setOutAnimation(aniIn);
        binding.nextBtn.setOnClickListener(v -> {
            setUpImages();
        });
    }

    private void setUpImages() {
        int[] imageSwitcherImages = {R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.th__1_};
        if(count < imageSwitcherImages.length) {
            if(count == 3) {
                Toast.makeText(this, "No Images", Toast.LENGTH_SHORT).show();
            } else {
                count ++;
                binding.imageSwitcher.setImageResource(imageSwitcherImages[count]);
            }
        }
    }
}