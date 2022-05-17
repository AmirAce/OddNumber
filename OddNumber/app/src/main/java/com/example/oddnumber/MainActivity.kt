package com.example.oddnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.oddnumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Resultbutton.setOnClickListener {
        var num = binding.editNum.text.toString().toInt()
        var oddnum = binding.textView.text.toString();
            var oddstring = "is odd"
            if(num % 2 == 0){
                oddnum = "$num is odd"
            }
            else {
                oddnum = "$num is even"
            }
        }
    }
}