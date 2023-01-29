package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityEditTextWithTextWatcherBinding;

import java.util.ArrayList;

public class EditTextWithTextWatcherActivity extends AppCompatActivity {

    private ActivityEditTextWithTextWatcherBinding binding;
    private ArrayList<String> productLists;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditTextWithTextWatcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setUpData();
        setUpTextWatcher();
    }

    private void setUpData() {
        productLists = new ArrayList<>();
        productLists.add("Apple");
        productLists.add("Banana");
        productLists.add("Pine apple");
        productLists.add("Orange");
        productLists.add("Grapes");
        productLists.add("Mango");
        productLists.add("Water Melon");
        productLists.add("Kiwi");
    }

    private void setUpTextWatcher() {
        adapter = new ArrayAdapter<String>(this, R.layout.text_watcher_item, R.id.product_txt, productLists);
        binding.listViewLv.setAdapter(adapter);
        binding.textWatcherTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Toast.makeText(EditTextWithTextWatcherActivity.this, "before Text changed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
                Toast.makeText(EditTextWithTextWatcherActivity.this, "After Text Changed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}