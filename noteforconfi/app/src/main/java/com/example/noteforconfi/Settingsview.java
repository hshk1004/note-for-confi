package com.example.noteforconfi;

import android.os.Bundle;
import android.view.View;

import android.database.sqlite.*;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Settingsview extends AppCompatActivity {

    Button button = null;
    TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void setBackgroundColor(View view){
        if(button == (Button)findViewById(R.id.whitebackground)){
            textView = (TextView)findViewById(R.id.main_noteview);
            textView.setBackgroundColor(111111);
            textView.setTextColor(000000);
        }else if(button == (Button)findViewById(R.id.blackbackground)){
            textView = (TextView)findViewById(R.id.main_noteview);
            textView.setBackgroundColor(000000);
            textView.setTextColor(111111);
        }else if(button == (Button)findViewById(R.id.graybackground)){
            textView = (TextView)findViewById(R.id.main_noteview);
            textView.setBackgroundColor(595959);
            textView.setTextColor(999999);
        }
    }

    public void setTextSize(View view){
        if(button == (Button)findViewById(R.id.smalltext)){
            textView = (TextView)findViewById(R.id.main_noteview);
            textView.setTextSize(10);
        }else if(button == (Button)findViewById(R.id.midletext)){
            textView = (TextView)findViewById(R.id.main_noteview);
            textView.setTextSize(14);
        }else if(button == (Button)findViewById(R.id.largetext)){
            textView = (TextView)findViewById(R.id.main_noteview);
            textView.setTextSize(20);
        }
    }
}
