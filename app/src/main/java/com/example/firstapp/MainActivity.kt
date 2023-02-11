package com.example.firstapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.firstapp.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key2")
        bindingClass.txt1Main.text = message

    }
<<<<<<< ours

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 100 && resultCode == RESULT_OK && data != null){
            bindingClass.txt1Main.text = data.getStringExtra("key2")
        }
    }
||||||| base

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 100 && resultCode == RESULT_OK && data != null){
            bindingClass.txt1Main.text = data.getStringExtra("key2")
        }
    }

    fun onClickGoTestActivity1(view: View){
        var i = Intent(this, TestActivity1::class.java)
        i.putExtra("key","What's your name?")
        startActivityForResult(i,100)
    }
=======
>>>>>>> theirs
}



