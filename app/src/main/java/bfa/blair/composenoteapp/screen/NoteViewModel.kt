package bfa.blair.composenoteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import bfa.blair.composenoteapp.data.NoteDataSource
import bfa.blair.composenoteapp.model.Note

class NoteViewModel : ViewModel() {
    val noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NoteDataSource().loadNotes())
    }

    fun addNote(note: Note) {
        noteList.add(note)
    }

    fun removeNote(note: Note) {
        noteList.remove(note)
    }

    fun getAllNotes() : List<Note> {
        return noteList
    }
}