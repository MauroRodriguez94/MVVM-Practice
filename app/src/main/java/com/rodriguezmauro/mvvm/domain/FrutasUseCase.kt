package com.rodriguezmauro.mvvm.domain

import com.rodriguezmauro.mvvm.data.FrutasDataSet
import com.rodriguezmauro.mvvm.ui.modelo.Frutas

class FrutasUseCase {
    val frutasDataSet = FrutasDataSet()

    fun obtenerListaDeFrutas(): List<Frutas> {
        return frutasDataSet.crearListaDeFrutas()
    }
}