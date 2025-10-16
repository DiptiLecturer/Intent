package org.freedu.firstuserreg

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.freedu.firstuserreg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.registerBtn.setOnClickListener {

            val email = binding.emailET.text.toString()
            val password = binding.passwordET.text.toString()
            val confirmPassword = binding.conPassET.text.toString()

            if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show()
            }
            if (password != confirmPassword) {
                Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show()
            }
            if (password.length < 8) {
                Toast.makeText(this, "Password must be 8 character", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this@MainActivity, HomePage::class.java)
                startActivity(intent)
                Toast.makeText(this, "register button clicked", Toast.LENGTH_SHORT).show()

            }


        }


    }


}