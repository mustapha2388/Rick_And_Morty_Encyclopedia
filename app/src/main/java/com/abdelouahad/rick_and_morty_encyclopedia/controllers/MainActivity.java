package com.abdelouahad.rick_and_morty_encyclopedia.controllers;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.abdelouahad.rick_and_morty_encyclopedia.R;
import com.abdelouahad.rick_and_morty_encyclopedia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mBinding.getRoot();
        setContentView(view);

        this.configureToolbar();
    }

    private void configureToolbar() {
        setSupportActionBar(mBinding.toolbar.getRoot());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.menu_1:
                Toast.makeText(this, "click On menu 1", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_2:
                Toast.makeText(this, "click On menu 2", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_3:
                Toast.makeText(this, "click On menu 3", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}