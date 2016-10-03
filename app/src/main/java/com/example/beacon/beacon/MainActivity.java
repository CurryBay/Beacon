package com.example.beacon.beacon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button scanButton = (Button) findViewById(R.id.scanButton);
        scanButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //ADD WHAT HAPPENS WHEN BUTTON PRESS HERE
            }
        });


    }
}
