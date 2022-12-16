package com.example.a4listener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a4listener.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //sumar un numero con un boton suma y restar con un boton resta
        var numero = 0
        binding.mas.setOnClickListener {
            numero++
            binding.suma.text = numero.toString()
        }
        binding.menos.setOnClickListener {
            if (numero > 0) {
                numero--
                binding.suma.text = numero.toString()
            }
        }

        //cambiar el color de los botones si el editText tiene focus activo
        binding.editTextNumber.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                binding.mas.setBackgroundColor(getColor(R.color.purple_200))
                binding.menos.setBackgroundColor(getColor(R.color.purple_200))
            } else {
                binding.mas.setBackgroundColor(getColor(R.color.purple_500))
                binding.menos.setBackgroundColor(getColor(R.color.purple_500))
            }
        }

    }

}

    /*
    //funcion para sumar con el boton +
    fun sumar(view: View) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numero = 0
        numero++
        binding.suma.text = numero.toString()
    }

    //funcion para sumar con el boton -
    fun restar(view: View) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numero = 0
        numero--
        binding.suma.text = numero.toString()
    }

    */
