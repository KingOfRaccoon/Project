package com.arbonik.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2main)
        prlogin.setText("Ваш логин: " + Profile.Login)
        prpass.setText("Ваш пароль: " + Profile.Password)
        prname.setText("Ваше имя: " + Profile.Name)
        prheight.setText("Ваш рост: " + Profile.Height.toString())
        prweight.setText("Ваша масса: " + Profile.Weight.toString())
        prage.setText("Ваш возраст: " + Profile.Age.toString())
        prsex.setText("Ваш пол: " + Profile.Sex)
    }
}
