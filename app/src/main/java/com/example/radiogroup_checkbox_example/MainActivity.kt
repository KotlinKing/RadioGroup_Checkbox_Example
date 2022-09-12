package com.example.radiogroup_checkbox_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val checkedFoodRadioButtonId = rgFood.checkedRadioButtonId
            val food = findViewById<RadioButton>(checkedFoodRadioButtonId)
            val cheese = cbCheese.isChecked
            val onion = cbOnion.isChecked
            val salad = cbSalad.isChecked

            val orderString = "You have ordered ${food.text} with:\n" +
                    (if (cheese) "\n Cheese" else "") +
                    (if (onion) "\n Onion" else "") +
                    (if (salad) "\n Salad" else "")

            tvOrder.text = orderString
        }
    }
}