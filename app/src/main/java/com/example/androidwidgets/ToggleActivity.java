package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity {
    private ToggleButton toggleOnBtn;
    private ToggleButton toggleOfBtn;
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        handleSubmitBtn();
    }

    private void handleSubmitBtn() {
        toggleOnBtn = findViewById(R.id.toggle_on_btn);
        toggleOfBtn = findViewById(R.id.toggle_off_btn);
        submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(v -> {
            String toggleOn = toggleOnBtn.getText().toString();
            String toggleOff = toggleOfBtn.getText().toString();
            Toast.makeText(this, toggleOn + "\n" + toggleOff , Toast.LENGTH_SHORT).show();
        });
    }
}