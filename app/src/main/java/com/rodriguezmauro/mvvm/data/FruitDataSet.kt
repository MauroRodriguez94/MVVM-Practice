package com.rodriguezmauro.mvvm.data

import com.rodriguezmauro.mvvm.ui.modelo.Fruit

class FruitDataSet {
    fun createFruitList(): List<Fruit> {
        return listOf(
            Fruit("Apple", "Red", 4.5, 150.3),
            Fruit("Banana", "Yellow", 5.6, 200.0),
            Fruit("Grapes", "Green", 10.5, 100.5)
        )
    }
}