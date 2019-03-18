package com.example.addressbookapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Create_Address extends AppCompatActivity {

    private static final String TAG = "Create_Address";

    EditText name;
    EditText streetAddress;
    EditText city;
    EditText state;
    EditText zipCode;
    EditText phoneNumber;
    EditText email;
    EditText person;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_address);

        name = findViewById(R.id.name);
        streetAddress = findViewById(R.id.street_address);
        city = findViewById(R.id.city);
        state = findViewById(R.id.state);
        zipCode = findViewById(R.id.zip_code);
        phoneNumber = findViewById(R.id.phone_number);
        email = findViewById(R.id.email);
        person = findViewById(R.id.person_type);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 3/15/19 Save to database
                Log.d(TAG, "onClick: name: " + name.getText().toString());
            }
        });
    }
}
