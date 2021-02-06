package com.example.thetemperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.thetemperatureconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun celsiusFunction(view: View){
        val farenheitView = binding.userTemp
        val farenheitValue = farenheitView.text.toString()
        if(!farenheitValue.isBlank()){
            val celsiusCovertedValue = (farenheitValue.toDouble() - 32) * 5/9
            val celsiusValue = String.format("%.2f", celsiusCovertedValue)
            Toast.makeText(this,
                            "$farenheitValue fahrenheit is $celsiusValue degrees celsius",
                            Toast.LENGTH_LONG).show()
        }else {
            Toast.makeText(this, "You must enter a value to convert", Toast.LENGTH_LONG).show()
        }
    }

    fun farenheitFunction(view: View){
        val celsiusView = binding.userTemp
        val celsiusValue = celsiusView.text.toString()

        if(!celsiusValue.isBlank()){
            val farenheitConvertedValue = celsiusValue.toDouble() * 9/5 + 32
            val farenheitValue = String.format("%.2f", farenheitConvertedValue)
            Toast.makeText(this,
                            "$celsiusValue degrees celsius is $farenheitValue farenheit",
                            Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "You must enter a value to convert", Toast.LENGTH_LONG).show()
        }
    }
}