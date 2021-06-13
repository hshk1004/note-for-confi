package com.example.noteforconfi;

import android.content.Intent;
import android.os.Bundle;

import android.database.sqlite.*;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class calanderveiw extends MainActivity {

    EditText caltextview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calanderveiw);
        caltextview = (EditText)findViewById(R.id.main_noteviewer);
        String memoData = TextFIleManager.load();
        caltextview.setText(memoData);
        Toast.makeText(this, "불러오기 끝!",Toast.LENGTH_LONG).show();
    }

    public void gotoMainView(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        String memoData = caltextview.getText().toString();
        TextFIleManager.save(memoData);
        caltextview.setText("");
        Toast.makeText(this, "저장!", Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        String memoData = caltextview.getText().toString();
        TextFIleManager.save(memoData);
        caltextview.setText("");
        Toast.makeText(this, "저장!", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

}
