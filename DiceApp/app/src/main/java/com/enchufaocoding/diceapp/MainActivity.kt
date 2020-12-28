package com.enchufaocoding.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

   // lateinit var randomNumberTxt : TextView
    //lateinit: le promete al compilador que luego esa variable sera inicializada, asignada y usada en el programa.

    lateinit var diceOneImg : ImageView // segundo cambio para agregar imagen
    lateinit var diceTwoImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  randomNumberTxt =  findViewById<TextView>(R.id.text_view_random_number) // asignamos el boton a una variable
        diceOneImg = findViewById(R.id.image_view_dice_one) // segundo cambio para agregar imagen. no es necesario definir el componente [ImagegeView]
        // porque lo hemos asignado a una variable antes!.
        diceTwoImg = findViewById(R.id.image_view_dice_two)


        val rollButton = findViewById<Button>(R.id.btn_roll_dice)

        // hacemos las operaciones con la variable del boton antes asignada
        rollButton.setOnClickListener(){
            rollDice()
        }

    }

    private fun rollDice() {
        val randomNumber1 = (1..6).random()
        /* val randomNumbertxt = findViewById<TextView>(R.id.text_view_random_number)
        // Cada vez que vamos a buscar un numero random tendria que acceder a esta funcion.
        // por eso se define como variable "lateinit" fuera de la funcion,
        // para que solo se acceda una sola vez. */
        // randomNumberTxt.text = randomNumber.toString() //removido en el segundo cambio.-

        val image1 = when (randomNumber1) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice_empty
        }
        diceOneImg.setImageResource(image1)

        val randomNumber2 = (1..6).random()

        val image2 = when (randomNumber2) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice_empty
        }
        diceTwoImg.setImageResource(image2)
    }
}