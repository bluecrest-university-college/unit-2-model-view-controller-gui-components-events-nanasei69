package com.example.addressbookapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    RecyclerView.Adapter adapter;

    FloatingActionButton fab;

    ArrayList<AddressBook> userAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recycler_view);

        userAddress = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            AddressBook addressBook = new AddressBook("Samuel Anane" ,
                    "Guava ln" , "Accra" , "East-Legon-Hills" ,
                    "1219" , "0503694431" , "samuelanane62@yahoo.com" ,
                    "Family");
            userAddress.add(addressBook);

        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserAdapter(userAddress);
        recyclerView.setAdapter(adapter);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Create_Address.class));
            }
        });

    }


}
