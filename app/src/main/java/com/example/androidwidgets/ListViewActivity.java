package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.androidwidgets.databinding.ActivityListViewBinding;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListViewBinding activityListViewBinding;
    private ArrayList<String> teamMembers;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityListViewBinding = ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(activityListViewBinding.getRoot());
        setData();
        handleListView();
    }

    private void setData() {
        teamMembers = new ArrayList<>();
        teamMembers.add("Anupama");
        teamMembers.add("Suresh");
        teamMembers.add("Rajesh");
        teamMembers.add("Om Prakash");
        teamMembers.add("SreeHarasha");
        teamMembers.add("Sunitha");
        teamMembers.add("Harish");
        teamMembers.add("Sumanth");
    }

    private void handleListView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamMembers);
        activityListViewBinding.teamMembersLv.setAdapter(arrayAdapter);
        activityListViewBinding.teamMembersLv.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, String.valueOf(teamMembers), Toast.LENGTH_SHORT).show();
        });
    }
}