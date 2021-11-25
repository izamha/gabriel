package com.izamha.mybooking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Not used -- Don't pay any attention
        Toolbar myToolbar = (Toolbar) findViewById(R.id.topAppBar);

        // Looking for the button so that we can navigate to another activity
        /*
          findViewById() is used to look for android views within the layout files
          We are going to use it to find the button
          */
        Button btnBook = findViewById(R.id.btn_book);

        btnBook.setOnClickListener(view -> {
            // Create an Intent so that you can navigate to ListViewActivity from the MainActivity
            Intent intent = new Intent(this, ListViewActivity.class);
            MainActivity.this.startActivity(intent);
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.favorite) {
            Toast.makeText(this, "Clicked on Favorite",
                    Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}