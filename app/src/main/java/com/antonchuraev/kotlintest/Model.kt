package com.antonchuraev.kotlintest

import android.util.Log

class Model:ModelInterface {

    override fun loadInformation(): String {
        return "Загруженное сообщение"
    }

}