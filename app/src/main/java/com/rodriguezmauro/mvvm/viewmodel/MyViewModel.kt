package com.rodriguezmauro.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rodriguezmauro.mvvm.domain.FruitUseCase
import com.rodriguezmauro.mvvm.ui.modelo.Fruit

class MyViewModel: ViewModel() {
    private val fruitUseCase = FruitUseCase() //this should be injected
    private val listData = MutableLiveData<List<Fruit>>()

    private fun setListData(fruitList: List<Fruit>) {
        this.listData.value = fruitList
    }

    fun getFruitList() {
        setListData(fruitUseCase.retrieveFruitList())
    }

    fun getFruitListLiveData(): LiveData<List<Fruit>> {
        return listData
    }
}