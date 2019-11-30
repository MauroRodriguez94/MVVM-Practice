package com.rodriguezmauro.mvvm.data

import com.rodriguezmauro.mvvm.ui.modelo.Frutas

class FrutasDataSet {
    fun crearListaDeFrutas(): List<Frutas> {
        return listOf(
            Frutas("Manzana", "Rojo", 4.5, 150.3),
            Frutas("Banana", "Amarillo", 5.6, 200.0),
            Frutas("Uvas", "Verde", 10.5, 100.5)
        )
    }
}