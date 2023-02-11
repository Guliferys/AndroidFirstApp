package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.view.View
import com.example.firstapp.databinding.ActivityTest1Binding

class TestActivity1 : AppCompatActivity() {
    lateinit var bindingClass: ActivityTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key")
        bindingClass.txt1Testactivity1.text = message
    }

    fun onClickSendBack(view : View) {
        //val i = Intent(this, MainActivity::class.java)
        intent.putExtra("key2", bindingClass.etxt2.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }

}