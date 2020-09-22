package pls.help.myapplication

import android.os.Bundle
import android.widget.NumberPicker
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val picker = findViewById<NumberPicker>(R.id.picker)
        picker.setFormatter { "$it kg" }
        picker.minValue = 400
        picker.maxValue = 2000
        picker.value = 700
    }
}
