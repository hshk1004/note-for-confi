package com.example.noteforconfi;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextFIleManager {
    private static final String FILE_NAME = "Memo.txt";
    static Context thecontext = null;

    public TextFIleManager(Context context){
        thecontext = context;
    }

    public static void save(String strData){
        if(strData == null || strData.equals("")){
            return;
        }

        FileOutputStream fileOutputStreammemo = null;

        try {
            fileOutputStreammemo = thecontext.openFileOutput(FILE_NAME, Context.MODE_PRIVATE);
            fileOutputStreammemo.write(strData.getBytes());
            fileOutputStreammemo.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String load(){
        try{
            FileInputStream fileInputStreammemo = thecontext.openFileInput(FILE_NAME);

            byte[] memoData = new byte[fileInputStreammemo.available()];
            while (fileInputStreammemo.read(memoData) != -1){
                return new String(memoData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            return "";
        }
        return null;
    }

    public void delete(){
        thecontext.deleteFile(FILE_NAME);
    }



}
