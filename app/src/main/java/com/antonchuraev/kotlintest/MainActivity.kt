package com.antonchuraev.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() , ViewInterface {
    private val LAYOUT = R.layout.activity_main

    lateinit var button: Button
    lateinit var myTextView: TextView

    lateinit var presenter: PresenterInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LAYOUT)

        myTextView = findViewById(R.id.text_view)
        myTextView.text = "Нажмите чтобы загрузить сообщение"
        button = findViewById(R.id.buttonMy)

        presenter = Presenter(this)

        button.setOnClickListener {
            presenter.onButtonWasClicked()
        }


    }

    override fun showInformation(info: String) {
        myTextView.text = info
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDetach();
    }
}