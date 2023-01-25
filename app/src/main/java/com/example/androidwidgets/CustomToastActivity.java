package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.androidwidgets.databinding.CustomtoastBinding;

public class CustomToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
        CustomtoastBinding customtoastBinding = CustomtoastBinding.inflate(getLayoutInflater());
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(customtoastBinding.getRoot());
        toast.show();
    }
}