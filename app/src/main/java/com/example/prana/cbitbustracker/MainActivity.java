package com.example.prana.cbitbustracker;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button locationbutton;
    Button registerbutton;
    EditText busno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locationbutton = (Button) findViewById(R.id.locationbutton);
        registerbutton = (Button) findViewById(R.id.registerbutton);
        busno = (EditText)findViewById(R.id.busno);
        busno.setTextColor(Color.WHITE);

        locationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapspage();

            }
        });

        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (busno.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter Bus Number", Toast.LENGTH_LONG).show();
                } else {

                    openMapsActivity2();

                }
            }
        });
    }

    public void openMapspage() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }

    public void openMapsActivity2() {

        String str = busno.getText().toString();

        Toast.makeText(MainActivity.this,"values added"+ busno.getText().toString(),Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MapsActivity2.class);
        intent.putExtra("busno1", str);
        startActivity(intent);
    }


}