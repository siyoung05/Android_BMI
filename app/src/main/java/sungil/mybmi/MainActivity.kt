package sungil.mybmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultButton: Button = findViewById(R.id.resultButton)
        val nameEditText : EditText = findViewById(R.id.nameEditText)
        val heightEditText : EditText = findViewById(R.id.heightEditText)
        val weighteditText : EditText = findViewById(R.id.weighteditText)
        resultButton.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("name", nameEditText.text.toString())
            intent.putExtra("height", heightEditText.text.toString().toInt())
            intent.putExtra("weight", weighteditText.text.toString().toInt())

            startActivity(intent)
        }
    }
}