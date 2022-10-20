/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var ventana: ImageView
    lateinit var nom: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val miBoton: Button = findViewById(R.id.tirarDado)
        miBoton.setOnClickListener{
            rollDice()
        }

        ventana = findViewById(R.id.dado)
        nom = findViewById(R.id.pais)
    }

    private fun rollDice(){

        val imagenRandom = when(shuf(1, 6)){

            1 -> R.drawable.kenya
            2 -> R.drawable.montenegro
            3 -> R.drawable.monaco
            4 -> R.drawable.somalia
            5 -> R.drawable.liechtenstein
            else -> R.drawable.madagascar
        }

        ventana.setImageResource(imagenRandom)
        if (imagenRandom == R.drawable.kenya)
            nom.text = "Kenya"
        else if (imagenRandom == R.drawable.montenegro)
            nom.text = "Montenegro"
        else if (imagenRandom == R.drawable.monaco)
            nom.text = "Monaco"
        else if (imagenRandom == R.drawable.somalia)
            nom.text = "Somalia"
        else if (imagenRandom == R.drawable.liechtenstein)
            nom.text = "Liechtenstein"
        else if(imagenRandom == R.drawable.madagascar)
            nom.text = "Madagascar"

    }

    fun shuf(start: Int, end: Int): Int {
        return (start..end).shuffled().first()
    }

}
