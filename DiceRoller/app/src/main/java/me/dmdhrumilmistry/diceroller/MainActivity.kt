package me.dmdhrumilmistry.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/*
* This activity allows user to roll a dice and view rolled value
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Roll the dice when app starts
        rollDice()

        // get roll button resource id
        val rollButton: Button = findViewById(R.id.roll_btn)

        // roll die when roll button is pressed
        rollButton.setOnClickListener { rollDice() }
    }

    /*
     * Roll a dice and display rolled value as text on screen
     */
    private fun rollDice(sides:Int = 6) {
        // get roll value text view and dice image view using id
        val diceImage: ImageView = findViewById(R.id.DiceImage)

        // Roll the die
        val diceRoll = Dice(sides).roll()

        // Get drawable image id based on roll value
        val diceImageDrawableResource = when (diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // set dice image using drawable image id
        diceImage.setImageResource(diceImageDrawableResource)

        // set image view content description using dice image id
        diceImage.contentDescription = diceRoll.toString()
    }
}

/*
* Dice class create a dice with n sides 
*/
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}