package com.rodriguezmauro.mvvm.domain

import com.rodriguezmauro.mvvm.data.FruitDataSet
import com.rodriguezmauro.mvvm.ui.modelo.Fruit

class FruitUseCase {
    private var fruitDataSet = FruitDataSet()

    fun retrieveFruitList(): List<Fruit> {
        return fruitDataSet.createFruitList()
    }
}