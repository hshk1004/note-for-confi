package com.example.noteforconfi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.noteforconfi.WordDao;

import java.util.List;

public class MainActivity<size> extends AppCompatActivity {

    EditText textView = null;
    Button button = null;
    TextFIleManager textFIleManager = new TextFIleManager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (EditText)findViewById(R.id.main_noteview);
        String memoData = TextFIleManager.load();
        textView.setText(memoData);
        Toast.makeText(this, "불러오기 끝!",Toast.LENGTH_LONG).show();
    }

    public void gotoCalanderview(View view){
        Intent intent = new Intent(getApplicationContext(), calanderveiw.class);
        startActivity(intent);

    }

    public void openSettings(View view){
        Intent intent = new Intent(getApplicationContext(), Settingsview.class);
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        String memoData = textView.getText().toString();
        TextFIleManager.save(memoData);
        textView.setText("");
        Toast.makeText(this, "저장!", Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        String memoData = textView.getText().toString();
        TextFIleManager.save(memoData);
        textView.setText("");
        Toast.makeText(this, "저장!", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}