package org.freedu.firstuserreg

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var regButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        regButton = findViewById(R.id.registerBtn)

        regButton.setOnClickListener {
            val intent = Intent(this@MainActivity,
                HomePage::class.java)
            startActivity(intent)
            Toast.makeText(this, "register button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}