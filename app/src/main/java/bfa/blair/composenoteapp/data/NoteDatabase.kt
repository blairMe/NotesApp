package bfa.blair.composenoteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import bfa.blair.composenoteapp.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao() : NoteDatabaseDao
}