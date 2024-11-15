package com.alina.noteapp.feature_note.data.data_sourece

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alina.noteapp.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object{
        const val DATABASE_NAME = "notes_db"
    }
}