package com.app.mynoteappcleanarch.feature_note.presentation.notes

import androidx.lifecycle.ViewModel
import com.app.mynoteappcleanarch.feature_note.domain.respository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class NoteViewModel @Inject constructor(
    private val repository: NoteRepository
) : ViewModel() {



}