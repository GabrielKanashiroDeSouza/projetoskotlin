package one.digitalinnovation.applicationcontentproviderclient

import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var  notesRecyclerView: RecyclerView
    lateinit var  notesRefreshButton: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notesRefreshButton=findViewById(R.id.refresh)
        notesRecyclerView=findViewById(R.id.client_list)
        notesRefreshButton.setOnClickListener{getContentProvider()}
    }

    private fun getContentProvider(){
        try {
            val url="content://one.digitalinnovation.applicationcontentprovider.provider/notes"
            val data =Uri.parse(url)
            val cursor: Cursor?=contentResolver.query(data,null,null,null,"title")
            notesRecyclerView.apply {
                layoutManager=LinearLayoutManager(this@MainActivity)
                adapter=ClientAdapter(cursor as Cursor)
            }
        }catch (ex: Exception){
               ex.printStackTrace()
        }
    }
}