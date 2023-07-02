package com.example.homework1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var nameET: EditText? = null
    var ageET: EditText? = null
    var heightET: EditText? = null
    var weightET: EditText? = null
    var btn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameET = findViewById(R.id.editText_name)
        ageET = findViewById(R.id.editText_age)
        heightET = findViewById(R.id.editText_height)
        weightET = findViewById(R.id.editText_weight)
        val resultTV = findViewById<TextView>(R.id.tv_result)
        btn = findViewById(R.id.button)

        var str = ""
        btn?.setOnClickListener {
            val name: String = nameET?.text.toString()
            try {
                val age: Int = ageET?.text.toString().toInt()
                var height: Double = heightET?.text.toString().toDouble()
                val weight: Double = weightET?.text.toString().toDouble()

                if (height > 3) height /= 100
                val bms = getBms(height, weight)
                val idealWeight = getIdealWeight(height, age)
                val res = getRes(bms)
                str = "$name, Ваш ИМТ: ${
                    String.format(
                        "%.2f",
                        bms
                    )
                }; $res\nИдеальный вес: ${String.format("%.2f", idealWeight)}"
                Log.i("ANSWER", str)
            } catch (e: NumberFormatException) {
                str = "Incorrect data: ${e.message}"
                Log.e("ERROR", str)
            }
            resultTV.text = str
        }
    }

    fun getIdealWeight(height: Double, age: Int): Double = when {
        age in 16..39 -> (height - 1.10) * 100
        age > 40 -> (height - 1) * 100
        else -> throw Exception("Incorrect data")
    }


    fun getRes(bms: Double): String = when {
        bms < 19 && bms > 15 -> "Недостаточный вес"
        bms > 19 && bms < 25 -> "Вес в норме"
        bms > 25 -> "Избыточный вес"
        else -> "Данные некорректны"
    }

    fun getBms(h: Double, w: Double): Double = w / (h * h)
}