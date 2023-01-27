package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

     public void handleAndroidButton() {
         Button androidButtonBtn = findViewById(R.id.android_button_btn);
         androidButtonBtn.setOnClickListener(view -> {
             Intent intent = new Intent(this, AndroidButtonActivity.class);
             startActivity(intent);
         });
     }

     public void handleCustomToast() {
        Button customToastBtn = findViewById(R.id.custom_toast_btn);
        customToastBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CustomToastActivity.class);
            startActivity(intent);
        });
     }

     public void handleToggleBtn() {
        Button toggleBtn = findViewById(R.id.toggle_btn);
        toggleBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ToggleActivity.class);
            startActivity(intent);
        });
     }

     public void handleCheckBox() {
        Button checkBox = findViewById(R.id.check_box_btn);
        checkBox.setOnClickListener(v -> {
            Intent intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });
     }

     public void handleAlertDialog() {
        Button alertDialog = findViewById(R.id.alert_dialog_btn);
        alertDialog.setOnClickListener(v -> {
            Intent intent = new Intent(this, AlertDialogActivity.class);
            startActivity(intent);
        });
     }

     public void handleRadioButton() {
        Button radioButton = findViewById(R.id.radiobutton_btn);
        radioButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, RadioButtonActivity.class);
            startActivity(intent);
        });
     }

     public void handleRatingBar() {
        Button ratingBar = findViewById(R.id.rating_bar_rb);
        ratingBar.setOnClickListener(v -> {
            Intent intent = new Intent(this, RatingBarActivity.class);
            startActivity(intent);
        });
     }

     public void handleSeekBar() {
        Button seekBar = findViewById(R.id.seek_bar);
        seekBar.setOnClickListener(v -> {
            Intent intent = new Intent(this, SeekBarActivity.class);
            startActivity(intent);
        });
     }

     public void handleDatePicker() {
        Button datePicker = findViewById(R.id.date_picker);
        datePicker.setOnClickListener(v -> {
            Intent intent = new Intent(this, DatePickerActivity.class);
            startActivity(intent);
        });
     }

     public void handleTimePicker() {
        Button timePicker = findViewById(R.id.time_picker_btn);
        timePicker.setOnClickListener(v -> {
            Intent intent = new Intent(this, TimePickerActivity.class);
            startActivity(intent);
        });
     }

     public void handleVerticalScrollView() {
        Button verticalScrollView = findViewById(R.id.vertical_scroll_view_btn);
        verticalScrollView.setOnClickListener(v -> {
            Intent intent = new Intent(this, VerticalScrollViewActivity.class);
            startActivity(intent);
        });
     }

     public void handleHorizontalScrollView() {
        Button horizontalScrollView = findViewById(R.id.horizontal_scroll_view_btn);
        horizontalScrollView.setOnClickListener(v -> {
            Intent intent = new Intent(this, HorizontalScrollViewActivity.class);
            startActivity(intent);
        });
     }

     public void handleListView() {
        Button listView = findViewById(R.id.list_view_btn);
        listView.setOnClickListener(v -> {
            Intent intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        });
     }

     public void handleCustomListView() {
        Button customListView = findViewById(R.id.custom_list_view_btn);
        customListView.setOnClickListener(v -> {
            Intent intent = new Intent(this, CustomListViewActivity.class);
            startActivity(intent);
        });
     }

     public void handleImageSwitcher() {
        Button imageSwitcher = findViewById(R.id.image_switcher_btn);
        imageSwitcher.setOnClickListener(v -> {
            Intent intent = new Intent(this,ImageSwitcherActivity.class);
            startActivity(intent);
        });
     }
}