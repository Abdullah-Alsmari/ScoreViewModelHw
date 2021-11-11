package com.example.scoreteamhw.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

  
    private var _scope = 0
    val scope: Int
        get() = _scope

    fun plusone () {
        _scope += 1
    }

    fun plusFour() {
        _scope += 4
    }

    fun subTwo() {
        if ( _scope >= 2) _scope -= 2
    }

}