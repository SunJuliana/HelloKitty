package com.example.hellokitty
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var helloTextView: TextView
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById(R.id.textView)
        editText = findViewById(R.id.editText)

        var imageButton: ImageButton = findViewById(R.id.imageButton)
        // альтернативный вариант
        // val imageButton = findViewById<ImageButton>(R.id.imageButton)
        // или val imageButton = findViewById(R.id.imageButton) as ImageButton

//        imageButton.setOnClickListener {
//            helloTextView.setText("Hello Kitty")
//        }

        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                helloTextView.text = "Hello Kitty!";
            } else {
                helloTextView.text = "Привет, " + editText.text + "!"
            }
        }
    }
}
