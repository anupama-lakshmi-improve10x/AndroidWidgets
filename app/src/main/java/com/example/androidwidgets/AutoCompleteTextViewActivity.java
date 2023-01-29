package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.androidwidgets.databinding.ActivityAutoCompleteTextViewBinding;

import java.util.ArrayList;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    private ActivityAutoCompleteTextViewBinding binding;
    private ArrayList<String> languages;
    private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setUpData();
        handleAutoCompleteTextView();
    }

    private void setUpData() {
        languages = new ArrayList<>();
        languages.add("C");
        languages.add("C++");
        languages.add("Java");
        languages.add(".NET");
        languages.add("Android");
    }

    private void handleAutoCompleteTextView() {
         arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, languages);
        binding.autoCompleteTxt.setThreshold(1);
        binding.autoCompleteTxt.setAdapter(arrayAdapter);
        binding.autoCompleteTxt.setTextColor(Color.MAGENTA);
    }
}