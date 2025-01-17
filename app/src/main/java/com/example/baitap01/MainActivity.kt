package com.example.baitap01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lấy các view
        val etInputText: EditText = findViewById(R.id.etInputText)
        val tvOutputText: TextView = findViewById(R.id.tvOutputText)
        val btnProcess: Button = findViewById(R.id.btnProcess)
        val tvOriginalText: TextView = findViewById(R.id.tvOriginalText)

        // Xử lý khi nhấn nút
        btnProcess.setOnClickListener {
            val inputText = etInputText.text.toString()

            val reversedText = inputText.split(" ").reversed().joinToString(" ").toUpperCase()

            // Hiển thị chuỗi gốc
            tvOriginalText.text = "Chuỗi gốc: $inputText"

            // Hiển thị chuỗi đảo ngược
            tvOutputText.text = "Chuỗi đảo ngược: $reversedText"

            // Hiển thị Toast thông báo
            Toast.makeText(this, "Xử lý thành công!", Toast.LENGTH_SHORT).show()
        }

        // Tạo mảng ArrayList ngẫu nhiên với số nguyên
        val randomNumbers = ArrayList<Int>()
        val random = Random()

        // Tạo 10 số ngẫu nhiên từ 1 đến 100 và thêm vào ArrayList
        for (i in 0..9) {
            randomNumbers.add(random.nextInt(100) + 1)  // Số ngẫu nhiên từ 1 đến 100
        }

        // Phân biệt số chẵn và số lẻ
        val evenNumbers = mutableListOf<Int>()
        val oddNumbers = mutableListOf<Int>()

        for (number in randomNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number)
            } else {
                oddNumbers.add(number)
            }
        }

        // In các số chẵn và số lẻ ra Logcat
        Log.d("Even Numbers", evenNumbers.toString())
        Log.d("Odd Numbers", oddNumbers.toString())
    }
}
