package one.digitalinnovation.vmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var txtNome:EditText
    lateinit var btnDados:Button
    lateinit var btnMostrar:Button
    lateinit var mViewmodel:MainViewModel

    var contador:Int =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDados()
        initClick()

    }


    private fun initDados(){
        mViewmodel=ViewModelProvider(this).get(MainViewModel::class.java)
        txtNome=findViewById(R.id.txtContador)
        btnDados=findViewById(R.id.btnDados)
        btnMostrar=findViewById(R.id.btnMostrar)
       mViewmodel.mContador.observe(this, Observer{valor ->txtNome.setText(valor)})
    }

    private fun initClick() {
        btnDados.setOnClickListener{
               mViewmodel.validarContadores()
        }
        btnMostrar.setOnClickListener{
            Toast.makeText(applicationContext,"valor Contador ${mViewmodel.mContador.value}",Toast.
            LENGTH_SHORT).show()
        }
    }




}