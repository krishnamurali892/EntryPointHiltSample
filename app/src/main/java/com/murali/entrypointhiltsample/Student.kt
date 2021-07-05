package com.murali.entrypointhiltsample

import android.content.Context
import dagger.hilt.EntryPoints

class Student(private val context: Context){

    private val entryPoint by lazy {
            EntryPoints.get(context.applicationContext, SharedPrefEntryPointInterface::class.java)
    }

    private val sharedPref by lazy {
        entryPoint.getPreferences()
    }

    fun putName(name: String){
        val editor = sharedPref.edit()
        editor.putString("name", name)
        editor.apply()
    }

    fun getName(): String?{
        return sharedPref.getString("name", "")
    }
}
