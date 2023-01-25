package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityAndroidButtonBinding;

public class AndroidButtonActivity extends AppCompatActivity {

    ActivityAndroidButtonBinding binding;
    private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAndroidButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleAddBtn();
        displayToast();
    }

    private void handleAddBtn() {
        addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(v -> {
            String firstNumber = binding.firstNumberTxt.getText().toString();
            String secondNumber = binding.secondNumberTxt.getText().toString();
            int number1 = Integer.valueOf(firstNumber);
            int number2 = Integer.valueOf(secondNumber);
            int sum = number1 + number2;
            Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
        });
    }

    private void displayToast() {
        Toast.makeText(this, "Hello world", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Welcome to Improve10x", Toast.LENGTH_LONG).show();
    }
}