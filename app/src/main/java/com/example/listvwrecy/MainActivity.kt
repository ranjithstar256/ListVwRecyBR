package com.example.listvwrecy

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listvwrecy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val users = arrayOf(
        "Virat Kohli", "Rohit Sharma", "Steve Smith",
        "Kane Williamson", "Ross Taylor"
    )
    lateinit var listView: ListView
    lateinit var bd : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bd = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bd.root)
        listView = bd.lv
        val adapter : ArrayAdapter<String> =
            ArrayAdapter(this,
                R.layout.pra,
                users)
        listView.adapter = adapter

    }



}