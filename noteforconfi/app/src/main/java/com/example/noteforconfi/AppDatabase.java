package com.example.noteforconfi;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Word.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract WordDao wordDao();

    private Context appContext;

    AppDatabase db = Room.databaseBuilder(appContext, AppDatabase.class, "Sample.db")
            .createFromAsset("database/myapp.db")
            .build();
}
