package com.example.androidwidgets;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidwidgets.databinding.ActivityAlertDialogBinding;

public class AlertDialogActivity extends AppCompatActivity {

    ActivityAlertDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleDialogBtn();
    }

    public void handleDialogBtn() {
        binding.dialogBtn.setOnClickListener(v -> {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Alert!");
            alertDialog.setMessage("Do you want to Cancel");
            alertDialog.setPositiveButton("Yes", (dialogInterface, i) -> {
                finish();
            });
            alertDialog.setNegativeButton("No", (dialogInterface, i) -> {
                alertDialog.setCancelable(true);
            });
            AlertDialog alertDialog1 = alertDialog.create();
            alertDialog1.show();
        });
    }
}