package com.example.sample_android_view_model.live_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ModelProfile : ViewModel() {
    var name = MutableLiveData<String>()

    fun updateName(value: String) {
        this.name.value = value
    }

}