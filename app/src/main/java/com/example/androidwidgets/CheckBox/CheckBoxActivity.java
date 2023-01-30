package com.example.androidwidgets.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity implements CheckBoxView{
    private ActivityCheckBoxBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleOrder();
    }

    @Override
    public void handleOrder() {
        binding.orderBtn.setOnClickListener(v -> {
            String orderDetails =  new CheckBoxControllerImpl().orderDetails(binding.pizzaCb.isChecked(),
                    binding.coffeeCb.isChecked(), binding.sugarCb.isChecked());
            showToast(orderDetails);
        });
    }

    @Override
    public void showToast(String message) {
        binding.toastTxt.setText(message);
    }
}