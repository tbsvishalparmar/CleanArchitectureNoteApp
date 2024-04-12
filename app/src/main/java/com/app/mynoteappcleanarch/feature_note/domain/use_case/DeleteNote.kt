package com.app.mynoteappcleanarch.feature_note.domain.use_case

import com.app.mynoteappcleanarch.feature_note.domain.model.Note
import com.app.mynoteappcleanarch.feature_note.domain.respository.NoteRepository

class DeleteNote(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke(note: Note) = noteRepository.deleteNote(note)
}