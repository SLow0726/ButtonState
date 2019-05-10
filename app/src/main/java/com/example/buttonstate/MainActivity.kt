package com.example.buttonstate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        btn.isPressed = true
val list = arrayListOf<String>()
        btn.setOnClickListener {
//            btn.isPressed = false
            btn.isSelected = !btn.isSelected
            Log.i("*******","${btn.isSelected}")
            if (btn.isSelected) {
                list.add("1")
                Log.i("******boolean","${btn.isSelected}")
            }
            else{
                list.remove("1")
                Log.i("******boolean","${btn.isSelected}")
            }
            Log.i("******","$list")
        }
    }
}
