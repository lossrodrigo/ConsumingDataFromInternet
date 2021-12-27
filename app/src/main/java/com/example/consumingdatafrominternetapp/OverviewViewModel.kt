package com.example.consumingdatafrominternetapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.consumingdatafrominternetapp.network.CatFacts
import com.example.consumingdatafrominternetapp.network.DailyCatFactsApi
import kotlinx.coroutines.launch

class OverviewViewModel: ViewModel() {

    private val _catImage = MutableLiveData<List<CatFacts>>()
    val catImage: LiveData<List<CatFacts>> = _catImage

    private val _response = MutableLiveData<String>()
    val response: LiveData<String> = _response

    init {
        getCatFacts()
    }

    private fun getCatFacts(){

        viewModelScope.launch {
            try {
                val list: List<CatFacts> = DailyCatFactsApi.retrofitService.getCatFacts()
                _response.value = "Success: Cat Facts retrieved \n See below some cat facts: \n ${list[1].text}"
            } catch (e: Exception) {
                _response.value = "Failure: ${e.message}"
            }
        }
    }
}