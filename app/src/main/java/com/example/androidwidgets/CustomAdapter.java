package com.example.androidwidgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.androidwidgets.databinding.ActivityCustomListViewBinding;
import com.example.androidwidgets.databinding.CustomlistviewitemBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<CustomList> {
    CustomlistviewitemBinding binding;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<CustomList> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       binding = CustomlistviewitemBinding.inflate(LayoutInflater.from(getContext()), parent, false);
       CustomList customList = getItem(position);
        Picasso.get().load(customList.imageUrl).into(binding.imageImg);
        binding.nameTxt.setText(customList.name);
        binding.messageTxt.setText(customList.message);
        return binding.getRoot();
    }
}

