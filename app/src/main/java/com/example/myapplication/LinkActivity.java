package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class LinkActivity extends AppCompatActivity {

    private RecyclerView linksRecyclerView;
    private LinksAdapter linksAdapter;
    private List<LinkItem> linkItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        if (savedInstanceState != null && savedInstanceState.containsKey("linkItems")) {
            linkItems = savedInstanceState.getParcelableArrayList("linkItems");
        } else {
            linkItems = new ArrayList<>();
        }



    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save the list of link items
        outState.putParcelableArrayList("linkItems", new ArrayList<>(linkItems));
    }

}