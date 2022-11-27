package com.example.diary.ui.todolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToDoListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is todolist Fragment"
    }
    val text: LiveData<String> = _text
}