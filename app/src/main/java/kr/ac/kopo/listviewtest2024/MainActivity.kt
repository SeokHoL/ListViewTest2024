package kr.ac.kopo.listviewtest2024
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kr.ac.kopo.listviewtest2024.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list = findViewById<ListView>(R.id.list)
        var items = arrayOf("바나나", "메론", "딸기", "포도", "키위", "귤", "사과", "배")
        var adaqter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        list.adapter = adaqter
        list.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext, items[position] + "는 정말 달콤해요~", Toast.LENGTH_SHORT).show()
        }
    }
}