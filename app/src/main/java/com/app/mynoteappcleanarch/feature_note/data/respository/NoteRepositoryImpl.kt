package com.app.mynoteappcleanarch.feature_note.data.respository

import com.app.mynoteappcleanarch.feature_note.data.data_source.NoteDao
import com.app.mynoteappcleanarch.feature_note.domain.model.Note
import com.app.mynoteappcleanarch.feature_note.domain.respository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {


    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return noteDao.deleteNote(note)
    }


}