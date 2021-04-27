package one.digitalinnovation.vmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var mContador=MutableLiveData<String>().apply{value="0"}
    private var contador:Int= 0

    private fun setMContador(){
        mContador.value=contador.toString()

    }
    private  fun validaContador(){
        if(contador<4) {
            contador++

        }else {
            contador = 0

        }
        setMContador()
    }

    fun validarContadores(){
        validaContador()
    }

}