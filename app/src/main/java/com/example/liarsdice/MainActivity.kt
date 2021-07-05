package com.example.liarsdice

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val rollActivityDice = RollActivityDice(6)

    override fun onBackPressed() {
        this.finishAffinity()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(rollActivityDice) {
            plusButton.setOnClickListener {
                when (amount++) {
                    1 -> diceImage2.visibility = View.VISIBLE
                    2 -> diceImage3.visibility = View.VISIBLE
                    3 -> diceImage4.visibility = View.VISIBLE
                    4 -> diceImage5.visibility = View.VISIBLE
                    else -> amount--
                }
            }

            minusButton.setOnClickListener {
                when (amount--) {
                    2 -> diceImage2.visibility = View.GONE
                    3 -> diceImage3.visibility = View.GONE
                    4 -> diceImage4.visibility = View.GONE
                    5 -> diceImage5.visibility = View.GONE
                    else -> amount++
                }
            }
        }

        rollButton.setOnClickListener {
            rollDices()
        }

        rollModeButton.setOnClickListener {
            val intent = Intent(this@MainActivity, GameMode::class.java)
            startActivity(intent)
        }
    }

    private fun rollDices() {
        with(rollActivityDice) {
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

            diceImage1.setImageResource(list[num])
            diceImage1.contentDescription = num++.toString()
            diceImage2.setImageResource(list[num])
            diceImage2.contentDescription = num++.toString()
            diceImage3.setImageResource(list[num])
            diceImage3.contentDescription = num++.toString()
            diceImage4.setImageResource(list[num])
            diceImage4.contentDescription = num++.toString()
            diceImage5.setImageResource(list[num])
            diceImage4.contentDescription = num.toString()
            num = 0
            list.clear()
        }
    }
}