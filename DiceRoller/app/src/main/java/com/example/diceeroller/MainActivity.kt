    package com.example.diceeroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

    class MainActivity : AppCompatActivity() {

    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage1 = findViewById(R.id.dice1_image)
        diceImage2 = findViewById(R.id.dice2_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener { clear() }

//        val countUpButton: Button = findViewById(R.id.count_up)
//        countUpButton.setOnClickListener { countUp() }
//
//        val resetButton: Button = findViewById(R.id.reset)
//        resetButton.setOnClickListener { reset() }
    }

    private fun clear() {
        diceImage1.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_5
        }
    }

    private fun rollDice() {
            diceImage1.setImageResource(getRandomDiceImage())
            diceImage2.setImageResource(getRandomDiceImage())

//        resultText.text = randomInt.toString()
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
    }

//    private fun countUp(){
//        val resultText: TextView = findViewById(R.id.result_text)
//        if (resultText.text.toString() == "Hello World!"){
//            resultText.text = "1"
//        }
//        else if (resultText.text.toString() != "6"){
//            resultText.text = (resultText.text.toString().toInt() + 1).toString()
//        }
//    }

//    private fun reset(){
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "0"
//    }
}