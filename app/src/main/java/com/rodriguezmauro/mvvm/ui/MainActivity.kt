package com.rodriguezmauro.mvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rodriguezmauro.mvvm.R
import com.rodriguezmauro.mvvm.ui.modelo.Fruit
import com.rodriguezmauro.mvvm.viewmodel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpViewModel()
        createFruitList.setOnClickListener {
            viewModel.getFruitList()
        }
    }

    private fun setUpViewModel() {
        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        val fruitsObserver = Observer<List<Fruit>> { fruits ->
            fruits.forEachIndexed { index, fruit ->
                Log.d("Fruit", "$index, ${fruit.name}")
            }
        }

        viewModel.getFruitListLiveData().observe(this, fruitsObserver)
    }
}
