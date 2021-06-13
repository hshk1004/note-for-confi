package com.example.noteforconfi;

import android.content.Intent;
import android.os.Bundle;

import android.database.sqlite.*;
import android.view.View;

public class calanderveiw extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calanderveiw);
    }

    public void gotoMainView(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}
