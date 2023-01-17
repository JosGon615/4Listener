package com.example.a4listener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import com.example.a4listener.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //sumar un numero con un boton suma y restar con un boton resta
        binding.mas.setOnClickListener {
            binding.suma.text = (binding.suma.text.toString().toInt() + 1).toString()
        }
        binding.menos.setOnClickListener {
            if (binding.suma.text.toString().toInt() > 0) {
                binding.suma.text = (binding.suma.text.toString().toInt() - 1).toString()
            }
        }

        //cambiar el color de los botones si el editTextNumber tiene focus activo
        binding.editTextNumber.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                binding.mas.setBackgroundColor(getColor(R.color.purple_200))
                binding.menos.setBackgroundColor(getColor(R.color.purple_200))
            } else {
                binding.mas.setBackgroundColor(getColor(R.color.purple_500))
                binding.menos.setBackgroundColor(getColor(R.color.purple_500))
            }
        }

        binding.editTextNumber.addTextChangedListener {
            binding.suma.text = it.toString()
        }

    }

}
