package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.androidwidgets.CheckBox.CheckBoxActivity;
import com.example.androidwidgets.databinding.ActivityMainBinding;
import com.example.androidwidgets.imageSwitcher.ImageSwitcherActivity;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleAndroidButton();
        handleCustomToast();
        handleToggleBtn();
        handleCheckBox();
        handleAlertDialog();
        handleRadioButton();
        handleRatingBar();
        handleSeekBar();
        handleRatingBar();
        handleDatePicker();
        handleTimePicker();
        handleVerticalScrollView();
        handleHorizontalScrollView();
        handleListView();
        handleCustomListView();
        handleImageSwitcher();
        handleImageSlider();
        handleProgressDialog();
        handleWebViewBtn();
        handleSpinner();
        handleCustomAlertDialog();
        handleSearchView();
        handleEditTextWithTextWatcher();
        handleSearchViewToolBar();
        handleAutoCompleteText();
        handleMultiAutoCompleteText();
    }

     public void handleAndroidButton() {
         Button androidButtonBtn = findViewById(R.id.android_button_btn);
         androidButtonBtn.setOnClickListener(view -> {
             Intent intent = new Intent(this, AndroidButtonActivity.class);
             startActivity(intent);
         });
     }

     public void handleCustomToast() {
        binding.customToastBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CustomToastActivity.class);
            startActivity(intent);
        });
     }

     public void handleToggleBtn() {
        binding.toggleBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ToggleActivity.class);
            startActivity(intent);
        });
     }

     public void handleCheckBox() {
        binding.checkBoxBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });
     }

     public void handleAlertDialog() {
        binding.alertDialogBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, AlertDialogActivity.class);
            startActivity(intent);
        });
     }

     public void handleRadioButton() {
        binding.radiobuttonBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, RadioButtonActivity.class);
            startActivity(intent);
        });
     }

     public void handleRatingBar() {
        binding.radiobuttonBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, RatingBarActivity.class);
            startActivity(intent);
        });
     }

     public void handleSeekBar() {
        binding.seekBar.setOnClickListener(v -> {
            Intent intent = new Intent(this, SeekBarActivity.class);
            startActivity(intent);
        });
     }

     public void handleDatePicker() {
        binding.datePicker.setOnClickListener(v -> {
            Intent intent = new Intent(this, DatePickerActivity.class);
            startActivity(intent);
        });
     }

     public void handleTimePicker() {
        binding.timePickerBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, TimePickerActivity.class);
            startActivity(intent);
        });
     }

     public void handleVerticalScrollView() {
        binding.verticalScrollViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, VerticalScrollViewActivity.class);
            startActivity(intent);
        });
     }

     public void handleHorizontalScrollView() {
        binding.horizontalScrollViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, HorizontalScrollViewActivity.class);
            startActivity(intent);
        });
     }

     public void handleListView() {
        binding.listViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        });
     }

     public void handleCustomListView() {
        binding.customListViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CustomListViewActivity.class);
            startActivity(intent);
        });
     }

     public void handleImageSwitcher() {
        binding.imageSwitcherBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ImageSwitcherActivity.class);
            startActivity(intent);
        });
     }

     public void handleImageSlider() {
        binding.imageSliderBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ImageSliderActivity.class);
            startActivity(intent);
        });
     }

     public void handleProgressDialog() {
        binding.progressDialogBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProgressDialogActivity.class);
            startActivity(intent);
        });
     }

     public void handleWebViewBtn() {
        binding.webViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, WebViewActivity.class);
            startActivity(intent);
        });
     }

     public void handleSpinner() {

        binding.spinnerSpBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        });
     }

     public void handleCustomAlertDialog() {
       binding.customListViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CustomAlertDialogActivity.class);
            startActivity(intent);
        });
     }

     public void handleSearchView() {
        binding.searchViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SearchViewActivity.class);
            startActivity(intent);
        });
     }

     public void handleEditTextWithTextWatcher() {
        binding.textWatcherBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, EditTextWithTextWatcherActivity.class);
            startActivity(intent);
        });
     }

     public void handleSearchViewToolBar() {
        binding.searchViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SearchViewToolBarActivity.class);
            startActivity(intent);
        });
     }

     public void handleAutoCompleteText() {
        binding.autoTextBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, AutoCompleteTextViewActivity.class);
            startActivity(intent);
        });
     }

     public void handleMultiAutoCompleteText() {
        binding.multiAutoTxtBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MultiAutoTextActivity.class);
            startActivity(intent);
        });
     }
}