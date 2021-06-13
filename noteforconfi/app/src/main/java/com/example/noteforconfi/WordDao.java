package com.example.noteforconfi;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {
    @Query("SELECT * FROM word")
    List<Word> getAll();

    @Query("SELECT * FROM word WHERE wid IN (:wordIds)")
    List<Word> loadAllByIds(int[] wordIds);

    @Query("SELECT * FROM word WHERE note_title LIKE :first AND " +
            "main_note LIKE :last LIMIT 1")
    Word findByName(String first, String last);

    @Insert
    void insertAll(Word... words);

    @Delete
    void delete(Word word);
}
