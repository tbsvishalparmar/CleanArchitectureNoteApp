package com.app.mynoteappcleanarch.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.app.mynoteappcleanarch.ui.theme.BabyBlue
import com.app.mynoteappcleanarch.ui.theme.LightGreen
import com.app.mynoteappcleanarch.ui.theme.RedOrange
import com.app.mynoteappcleanarch.ui.theme.RedPink
import com.app.mynoteappcleanarch.ui.theme.Violet

@Entity
data class Note(
    val title : String,
    val content : String,
    val timeStamp : Long,
    val color : Int,
    @PrimaryKey val id: Int? = null
){

    val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)




}
