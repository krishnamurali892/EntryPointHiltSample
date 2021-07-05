package com.murali.entrypointhiltsample

import android.content.SharedPreferences
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface SharedPrefEntryPointInterface {
    // this dependency need tobe provided by @Provides or Constructor Injected.
    fun getPreferences(): SharedPreferences
}