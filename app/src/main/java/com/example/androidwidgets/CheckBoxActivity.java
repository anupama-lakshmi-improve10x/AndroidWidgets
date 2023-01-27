package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {
    ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleOrderBtn();
    }

    private void handleOrderBtn() {
        binding.orderBtn.setOnClickListener(v -> {
            boolean isPizzaSelected = binding.pizzaCb.isChecked();
            boolean isCoffeeSelected = binding.coffeeCb.isChecked();
            boolean isSugarSelected = binding.sugarCb.isChecked();
            String orderDetails = createOrder(isPizzaSelected, isCoffeeSelected, isSugarSelected);
            Toast.makeText(this, orderDetails, Toast.LENGTH_SHORT).show();

        });
    }

    private String createOrder(boolean isPizzaSelected, boolean isCoffeeSelected, boolean isSugarSelected) {
        int totalAmount = 0;
        String orderDetails = "Selected Items";
        if (isPizzaSelected) {
            totalAmount += 500;
            orderDetails += "\nPizza:500";
        }
        if (isCoffeeSelected) {
            totalAmount += 50;
            orderDetails += "\nCoffee:50";
        }
        if (isSugarSelected) {
            totalAmount += 250;
            orderDetails += "\n Sugar:250";
        }
        orderDetails += "\nTotal:Rs" + totalAmount;
        return orderDetails;
    }
}