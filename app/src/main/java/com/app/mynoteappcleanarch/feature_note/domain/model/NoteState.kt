package com.app.mynoteappcleanarch.feature_note.domain.model

import com.app.mynoteappcleanarch.feature_note.domain.utils.NoteOrder
import com.app.mynoteappcleanarch.feature_note.domain.utils.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Decending)
    val isOrderSectionVisible : Boolean = false
)