package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.androidwidgets.databinding.ActivityWebViewBinding;

public class WebViewActivity extends AppCompatActivity {

   private ActivityWebViewBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleWebView();
    }

    private void handleWebView() {
     binding.webViewWv.loadUrl("https://www.javatpoint.com/");
    // binding.webViewWv.loadUrl("https://improve10x.com");
    }
}