package com.example.liarsdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceImage2: ImageView = findViewById(R.id.dice_image2)
        val diceImage3: ImageView = findViewById(R.id.dice_image3)
        val diceImage4: ImageView = findViewById(R.id.dice_image4)
        val diceImage5: ImageView = findViewById(R.id.dice_image5)

        val rollButton: Button = findViewById(R.id.roll_button)
        val plusButton: Button = findViewById(R.id.plus_button)
        val minusButton: Button = findViewById(R.id.minus_button)

        val dice = Dice(6)

        with(dice) {
            plusButton.setOnClickListener {
                when (amountDice++) {
                    1 -> diceImage2.visibility = View.VISIBLE
                    2 -> diceImage3.visibility = View.VISIBLE
                    3 -> diceImage4.visibility = View.VISIBLE
                    4 -> diceImage5.visibility = View.VISIBLE
                    else -> amountDice--
                }
            }

            minusButton.setOnClickListener {
                when (amountDice--) {
                    2 -> diceImage2.visibility = View.GONE
                    3 -> diceImage3.visibility = View.GONE
                    4 -> diceImage4.visibility = View.GONE
                    5 -> diceImage5.visibility = View.GONE
                    else -> amountDice++
                }
            }
        }

        rollButton.setOnClickListener {
            rollDices()
        }
    }

    private fun rollDices() {
        val diceImage1: ImageView = findViewById(R.id.dice_image1)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)
        val diceImage3: ImageView = findViewById(R.id.dice_image3)
        val diceImage4: ImageView = findViewById(R.id.dice_image4)
        val diceImage5: ImageView = findViewById(R.id.dice_image5)

        val dice = Dice(6)
        val list = mutableListOf<Int>()

        with(dice) {
            repeat(5) {

                val drawableResource = when (roll()) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
                list.add(drawableResource)
            }
            diceImage1.setImageResource(list[numDice])
            diceImage1.contentDescription = numDice++.toString()
            diceImage2.setImageResource(list[numDice])
            diceImage2.contentDescription = numDice++.toString()
            diceImage3.setImageResource(list[numDice])
            diceImage3.contentDescription = numDice++.toString()
            diceImage4.setImageResource(list[numDice])
            diceImage4.contentDescription = numDice++.toString()
            diceImage5.setImageResource(list[numDice])
            diceImage4.contentDescription = numDice.toString()
        }
    }
}