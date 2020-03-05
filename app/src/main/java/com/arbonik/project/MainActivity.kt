package com.arbonik.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun display(v : View) {
        Profile.Login = login.text.toString()
        Profile.Password = password.text.toString()
        Profile.Name = name.text.toString()
        Profile.Height = height.text.toString().toDouble()
        Profile.Weight = weight.text.toString().toDouble()
        Profile.Age = age.text.toString().toInt()
        if (radioButton_male.isChecked == true)
            Profile.Sex = "Мужчина"
        else
            Profile.Sex = "Женщина"
        var next: Intent = Intent(this@MainActivity, Main2Activity::class.java)
        next.putExtra("login",Profile.Login)
        startActivity(next)
    }
}
