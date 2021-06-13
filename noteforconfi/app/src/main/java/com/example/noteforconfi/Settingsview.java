package com.example.noteforconfi;

import android.os.Bundle;
import android.view.View;

import android.database.sqlite.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Settingsview extends AppCompatActivity {

    Button button = null;
    EditText textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void setBackgroundColor(View view){
        if(button == (Button)findViewById(R.id.whitebackground)){
            textView = (EditText)findViewById(R.id.main_noteview);
            textView.setBackgroundColor(111111);
            textView.setTextColor(000000);
        }else if(button == (Button)findViewById(R.id.blackbackground)){
            textView = (EditText)findViewById(R.id.main_noteview);
            textView.setBackgroundColor(000000);
            textView.setTextColor(111111);
        }else if(button == (Button)findViewById(R.id.graybackground)){
            textView = (EditText)findViewById(R.id.main_noteview);
            textView.setBackgroundColor(595959);
            textView.setTextColor(999999);
        }
    }

    public void setTextSize(View view){
        if(button == (Button)findViewById(R.id.smalltext)){
            textView = (EditText)findViewById(R.id.main_noteview);
            textView.setTextSize(10);
        }else if(button == (Button)findViewById(R.id.midletext)){
            textView = (EditText)findViewById(R.id.main_noteview);
            textView.setTextSize(14);
        }else if(button == (Button)findViewById(R.id.largetext)){
            textView = (EditText)findViewById(R.id.main_noteview);
            textView.setTextSize(20);
        }
    }
}
