package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.myapplication.counter_activity.CounterActivity
import com.example.myapplication.grill_activity.GrillActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartCounterActivity = findViewById<Button>(R.id.btnStartCounterActivity)
        val btnStartGrillActivity = findViewById<Button>(R.id.btnStartGrillActivity)

        btnStartCounterActivity.setOnClickListener {
            val intent = Intent(this, CounterActivity::class.java)
            startActivity(intent)
            Log.d("Dzoki", "Startovo se aktivity")
        }

        btnStartGrillActivity.setOnClickListener {
            val intent = Intent(this, GrillActivity::class.java)
            startActivity(intent)
            Log.d("Dzoki", "Startovo se aktivity")
        }
    }
}