package com.app.mynoteappcleanarch.feature_note.domain.use_case

import com.app.mynoteappcleanarch.feature_note.domain.model.Note
import com.app.mynoteappcleanarch.feature_note.domain.respository.NoteRepository
import kotlinx.coroutines.flow.Flow

class GetNote(
    private val noteRepository: NoteRepository
) {

    operator fun invoke(): Flow<List<Note>>{
        return noteRepository.getNotes()
    }
}