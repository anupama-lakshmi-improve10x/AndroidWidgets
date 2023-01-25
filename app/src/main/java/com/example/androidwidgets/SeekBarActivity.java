package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivitySeekBarBinding;

public class SeekBarActivity extends AppCompatActivity {

    ActivitySeekBarBinding seekBarBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        seekBarBinding = ActivitySeekBarBinding.inflate(getLayoutInflater());
        setContentView(seekBarBinding.getRoot());
        handleSeekBar();
    }

    public void handleSeekBar() {
        seekBarBinding.seekBarSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(SeekBarActivity.this, "Seek Bar", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this, "Seek bar Started", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this, "Seek Bar Stopped", Toast.LENGTH_SHORT).show();
            }
        });
    }
}