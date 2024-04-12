package com.app.mynoteappcleanarch.feature_note.domain.use_case

import com.app.mynoteappcleanarch.feature_note.domain.model.Note
import com.app.mynoteappcleanarch.feature_note.domain.respository.NoteRepository
import com.app.mynoteappcleanarch.feature_note.domain.utils.NoteOrder
import com.app.mynoteappcleanarch.feature_note.domain.utils.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNote(
    private val noteRepository: NoteRepository
) {

    operator fun invoke(noteOrder: NoteOrder = NoteOrder.Date(OrderType.Decending)): Flow<List<Note>>{
        return noteRepository.getNotes().map {
            note-> when(noteOrder.orderType){
                is OrderType.Ascending ->{
                    when(noteOrder){
                        is NoteOrder.Date -> note.sortedBy { it.timeStamp }
                        is NoteOrder.Title ->  note.sortedBy { it.title }
                        is NoteOrder.Color ->  note.sortedBy { it.color }
                    }
                }
                is OrderType.Decending -> {
                    when(noteOrder){
                        is NoteOrder.Date -> note.sortedByDescending { it.timeStamp }
                        is NoteOrder.Title ->  note.sortedByDescending { it.title }
                        is NoteOrder.Color ->  note.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}