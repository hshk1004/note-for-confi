package com.example.noteforconfi;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

public class Word {
    @Entity
    public class word {
        @PrimaryKey
        public int wid;

        @ColumnInfo(name = "note_title")
        public String note_title;

        @ColumnInfo(name = "main_note")
        public String main_note;
    }
}
