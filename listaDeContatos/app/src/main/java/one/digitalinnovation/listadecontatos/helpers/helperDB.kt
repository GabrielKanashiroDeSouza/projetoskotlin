package one.digitalinnovation.listadecontatos.helpers

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class helperDB(
    context: Context
) : SQLiteOpenHelper(context, NOME_DO_BANCO, null, VERSAO_ATUAL_DO_BANCO) {
    companion object{
        private val NOME_DO_BANCO="contato.db"
        private val VERSAO_ATUAL_DO_BANCO= 1
    }
    val TABLE_NAME="contato"
    val DROP_TABLE="DROP TABLE IF EXISTS $TABLE_NAME"
    val Columns_ID="id"
    val Columns_Nome="nome"
    val Columns__Telefone="Telefone"
    val CREATE_TABLE="CREATE TABLE $TABLE_NAME (" +
            " $Columns_ID INTEGER NOT NULL," +
            "$Columns_Nome TEXT NOT NULL"+
            "$Columns__Telefone TEXT NOT NULL "+
            "PRIMARY KEY ($Columns_ID AUTOINCREMENT) "         +" )"
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if(oldVersion!=newVersion){
            db?.execSQL(DROP_TABLE)
            onCreate(db)
            //update da sua table ou criar novas tabelas
        }
        TODO("Not yet implemented")
    }

}