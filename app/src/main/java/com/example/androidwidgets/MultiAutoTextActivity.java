package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import com.example.androidwidgets.databinding.ActivityMultiAutoTextBinding;

public class MultiAutoTextActivity extends AppCompatActivity {

    private ActivityMultiAutoTextBinding binding;
    private ArrayAdapter<String> arrayAdapter;
    private String[] androidVersion = {"Aestro", "Blender", "CupCake", "Eclair", "Icecream Sandwich","Lollipop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMultiAutoTextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleMultiAutoText();
    }

    private void handleMultiAutoText() {
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, androidVersion);
        binding.multiAutoViewTxt.setAdapter(arrayAdapter);
        binding.multiAutoViewTxt.setThreshold(1);
        binding.multiAutoViewTxt.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}