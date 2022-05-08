package sungil.mybmi

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val name = intent.getStringExtra("name") // MainActivity에서 넘어온 값을 사용할 수 있도록 변수에 저장
        val height = intent.getIntExtra("height", 0)
        val weight = intent.getIntExtra("weight", 0)

        val bmi = weight / (height * 0.01).pow(2) // bmi계산

        val resultTexet = when {
            bmi >= 30 -> "비만" // bmi가 30이상일시
            bmi >= 25 -> "과체중" // bmi가 25이상일시
            bmi >= 20 -> "정상" // bmi가 20이상일시
            else -> "저체중" // bmi가 20미만일시
        }

        val resultTextView : TextView = findViewById(R.id.resultTextView) // 출력할 문자를 입력하여 변수에 저장
        resultTextView.text = "${name}님의 BMI는 ${bmi}입니다. 결과는 ${resultTexet}입니다."

        Toast.makeText(this, "${name} / ${height} / ${weight}", Toast.LENGTH_SHORT).show() // 출력

    }
}