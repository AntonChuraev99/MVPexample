package com.antonchuraev.kotlintest

interface ModelInterface {
    fun loadInformation():String
}

interface ViewInterface{
    fun showInformation(info:String)
}

interface PresenterInterface{
    fun onButtonWasClicked()
    fun onDetach()
}



