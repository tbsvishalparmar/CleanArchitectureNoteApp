package com.app.mynoteappcleanarch.di

import android.app.Application
import androidx.room.Room
import com.app.mynoteappcleanarch.feature_note.data.data_source.NoteDatabase
import com.app.mynoteappcleanarch.feature_note.data.respository.NoteRepositoryImpl
import com.app.mynoteappcleanarch.feature_note.domain.respository.NoteRepository
import com.app.mynoteappcleanarch.feature_note.domain.use_case.DeleteNote
import com.app.mynoteappcleanarch.feature_note.domain.use_case.GetNote
import com.app.mynoteappcleanarch.feature_note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DB_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideRepository(database: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(
            database.noteDao
        )
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNote = GetNote(repository),
            deleteNote = DeleteNote(repository)
        )
    }


}