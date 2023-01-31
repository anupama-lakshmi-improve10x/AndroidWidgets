package com.example.androidwidgets.imageSwitcher;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.example.androidwidgets.R;
import com.example.androidwidgets.databinding.ActivityImageSwitcherBinding;

public class ImageSwitcherActivity extends AppCompatActivity implements ImageSwitcherView {

    ActivityImageSwitcherBinding binding;
    int[] imageSwitcherImages = {R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.th__1_};
    int switcherImageLength = imageSwitcherImages.length;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSwitcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showImage(R.drawable.img);
        handleNext();

    }

    @Override
    public void handleNext() {
        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        binding.imageSwitcher.setOutAnimation(aniOut);
        binding.imageSwitcher.setOutAnimation(aniIn);
        binding.nextBtn.setOnClickListener(v -> {
            count = new ImageSwitcherControllerImpl().getNextImagePosition(count, switcherImageLength);
            binding.imageSwitcher.setImageResource(imageSwitcherImages[count]);
        });
    }

    @Override
    public void showImage(int resourceId) {
        binding.imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT
                ));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(resourceId);
                return imageView;
            }
        });
    }
}