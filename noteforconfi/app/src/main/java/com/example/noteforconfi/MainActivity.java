package com.example.noteforconfi;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView = null;
    Button button = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.main_noteview);

    }

    public void gotoCalanderview(View view){
        Intent intent = new Intent(getApplicationContext(), calanderveiw.class);
        startActivity(intent);

    }

    public void openSettings(View view){
        Intent intent = new Intent(getApplicationContext(), Settingsview.class);
        startActivity(intent);
    }
}