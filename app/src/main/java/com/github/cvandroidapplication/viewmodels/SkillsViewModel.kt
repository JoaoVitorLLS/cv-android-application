package com.github.cvandroidapplication.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SkillsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Skills fragment"
    }

    val text: LiveData<String> = _text

}