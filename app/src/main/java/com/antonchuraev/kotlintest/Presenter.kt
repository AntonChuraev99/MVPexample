package com.antonchuraev.kotlintest

open class Presenter(v: ViewInterface?) : PresenterInterface {

    var view = v
    var model:ModelInterface = Model()

    override fun onButtonWasClicked() {
        var message = model.loadInformation();
        view?.showInformation(message);
    }


    override fun onDetach() {
        view=null
    }


}