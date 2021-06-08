package com.example.liarsdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn: Button = findViewById(R.id.rollBtn)
        rollBtn.setOnClickListener {
            rollDices()
        }
    }

    private fun rollDices() {
        val diceImage1: ImageView = findViewById(R.id.diceImage1)
        val diceImage2: ImageView = findViewById(R.id.diceImage2)
        val diceImage3: ImageView = findViewById(R.id.diceImage3)
        val diceImage4: ImageView = findViewById(R.id.diceImage4)
        val diceImage5: ImageView = findViewById(R.id.diceImage5)
        val dice = Dice(6)
        val list = mutableListOf<Int>()
        with(dice) {
            repeat(5)
            {
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
            diceImage1.setImageResource(list[numDice++])
            diceImage2.setImageResource(list[numDice++])
            diceImage3.setImageResource(list[numDice++])
            diceImage4.setImageResource(list[numDice++])
            diceImage5.setImageResource(list[numDice])
        }
    }
}