package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.SearchView;

import com.example.androidwidgets.databinding.ActivitySearchViewBinding;
import com.example.androidwidgets.databinding.ActivitySearchViewToolBarBinding;

import java.util.ArrayList;

public class SearchViewToolBarActivity extends AppCompatActivity {

    private ActivitySearchViewToolBarBinding binding;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewToolBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setUpList();
        handleSearchViewToolBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_view, menu);
        MenuItem searchViewItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchViewItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    private void setUpList() {
        list = new ArrayList<>();
        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
    }

    public void handleSearchViewToolBar() {
        adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, list);
        binding.listViewLv.setAdapter(adapter);
    }


}