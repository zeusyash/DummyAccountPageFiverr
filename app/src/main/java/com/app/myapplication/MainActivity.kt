package com.app.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var edit: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        doEdit(edit)

        binding.edit.setOnClickListener {
            edit = !edit
            doEdit(edit)
        }

    }

    fun doEdit(change: Boolean) {
        binding.apply {
            etUname.isEnabled = change

            etHigher1.isEnabled = change
            etHigher2.isEnabled = change
            etHigher3.isEnabled = change

            etAmt1.isEnabled = change
            etAmt2.isEnabled = change
            etAmt3.isEnabled = change

            etDesc1.isEnabled = change
            etDesc2.isEnabled = change
            etDesc3.isEnabled = change
        }
    }
}