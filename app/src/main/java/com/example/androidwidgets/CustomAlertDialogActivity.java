package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;

import com.example.androidwidgets.databinding.ActivityCustomAlertDialogBinding;
import com.example.androidwidgets.databinding.ActivitySpinnerBinding;
import com.example.androidwidgets.databinding.CustomAlertDialogItemBinding;

public class CustomAlertDialogActivity extends AppCompatActivity {

   private ActivityCustomAlertDialogBinding binding;
   private CustomAlertDialogItemBinding customalertdialogitemBinding;
   private Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleOnClick();
    }

    private void handleOnClick() {
        binding.clickBtn.setOnClickListener(v -> {
            dialog = new Dialog(this);
            customalertdialogitemBinding = CustomAlertDialogItemBinding.inflate(getLayoutInflater());
            dialog.setContentView(customalertdialogitemBinding.getRoot());
            customalertdialogitemBinding.dismissBtn.setOnClickListener(v1 -> {
                finish();
            });
            customalertdialogitemBinding.closeIb.setOnClickListener(v1 -> {
                dialog.dismiss();
            });
            customalertdialogitemBinding.alertMessageTxt.setText("Alert !!!....");
            dialog.show();
        });
    }
}