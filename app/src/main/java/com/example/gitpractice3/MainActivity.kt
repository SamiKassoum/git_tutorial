package com.example.gitpractice3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("this is contained in my second commit")
        println("local change")
        println("change 4")
        println("this line will be merged")
        println("change 5")
        println("change 6 made in youtube branch")
        println("now I am working with github!!")
        println("now I am right now  with the second try in github")
    }
}