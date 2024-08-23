package com.example.listvwrecy

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.listvwrecy.databinding.ActivityRecyExplBinding

class RecyExpl : AppCompatActivity() {
    lateinit var bd: ActivityRecyExplBinding
    val users = arrayOf(
        "Virat Kohli", "Rohit Sharma", "Steve Smith",
        "Kane Williamson", "Ross Taylor"
    )
    lateinit var rycylrvw : RecyclerView

    lateinit var receiver: MyReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bd = ActivityRecyExplBinding.inflate(layoutInflater)
        setContentView(bd.root)
        rycylrvw = bd.ryid
        val adapter = CustomAdapter(users)
        bd.ryid.adapter = adapter
        bd.ryid.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
        Log.i("lfjjab", "onCreate: ")

        receiver = MyReceiver()
        val k = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(receiver, k)
    }
}