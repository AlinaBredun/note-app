package com.alina.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alina.noteapp.ui.theme.BabyBlue
import com.alina.noteapp.ui.theme.LightGreen
import com.alina.noteapp.ui.theme.RedOrange
import com.alina.noteapp.ui.theme.RedPink
import com.alina.noteapp.ui.theme.Violet
import java.sql.Struct

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null,
)
{
    companion object{
        val  noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)