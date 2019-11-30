package com.rodriguezmauro.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rodriguezmauro.mvvm.domain.FrutasUseCase
import com.rodriguezmauro.mvvm.ui.modelo.Frutas

class MyViewModel: ViewModel() {
    val frutasUseCase = FrutasUseCase()
    private val listData = MutableLiveData<List<Frutas>>()

    init {
        getListaFrutas()
    }

    fun setListData(listFrutas: List<Frutas>) {
        this.listData.value = listFrutas
    }

    fun getListaFrutas() {
        setListData(frutasUseCase.obtenerListaDeFrutas())
    }

    fun getListaFrutasLiveData(): LiveData<List<Frutas>> {
        return listData
    }
}