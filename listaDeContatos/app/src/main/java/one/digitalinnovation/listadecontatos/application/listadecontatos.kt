package one.digitalinnovation.listadecontatos.application

import android.app.Application
import one.digitalinnovation.listadecontatos.helpers.helperDB
import java.io.File

class ContatosAplication:Application(){

    var helperDB1: helperDB?=null

         private set

    override fun onCreate() {
        super.onCreate()
        helperDB1= helperDB(this)
    }




}