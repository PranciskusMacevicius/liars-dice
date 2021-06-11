package com.example.liarsdice

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }

    var numDice = 0
    var amountDice = 5
}
