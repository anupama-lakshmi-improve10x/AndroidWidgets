package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidwidgets.databinding.ActivityCustomListViewBinding;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    ActivityCustomListViewBinding customListViewBinding;
    private ArrayList<CustomList> namesLv;
    private CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        customListViewBinding = ActivityCustomListViewBinding.inflate(getLayoutInflater());
        setContentView(customListViewBinding.getRoot());
        setData();
        customListView();
    }

    private void setData() {
        namesLv = new ArrayList<>();
        CustomList title = new CustomList();
        title.imageUrl = "https://www.freepnglogos.com/uploads/nature-png/image-nature-pictures-nnature-8.png";
        title.name = "Nature Image";
        title.message = "Save Nature";
        namesLv.add(title);

    }

    private void customListView() {
        customAdapter = new CustomAdapter(this, R.layout.activity_custom_list_view, namesLv);
        customListViewBinding.customLv.setAdapter(customAdapter);
    }
}