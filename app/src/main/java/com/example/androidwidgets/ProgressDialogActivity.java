package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.widget.ProgressBar;

import com.example.androidwidgets.databinding.ActivityProgressDialogBinding;

public class ProgressDialogActivity extends AppCompatActivity {

    private ActivityProgressDialogBinding binding;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        displayProgressDialog();
    }

    private void displayProgressDialog() {
        binding.progressDialogBoxBtn.setOnClickListener(v -> {
            progressDialog = new ProgressDialog(ProgressDialogActivity.this);
            progressDialog.setTitle("My Content");
            progressDialog.setMessage("Loading this Content, please wait!");
            progressDialog.show();
        });
    }
}