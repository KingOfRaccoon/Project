package com.arbonik.project

object Profile{
    var Password :String? = null
    var Login :String? = null
    var Name :String? = null
    var Height :Double? = null
    var Weight :Double? = null
    var Age :Int? = null
    var Sex : String? = null
    fun EnterLogin(){
        println("Введите логин:")
        Login = readLine()!!.toString()
    }
    fun EnterPassword(){
        println("Введите пароль:")
        Password = readLine()!!.toString()
    }
    fun EnterName(){
        println("Введите имя пользователя:")
        Name = readLine()!!.toString()
    }
    fun EnterAge(){
        println("Введите ваш возраст:")
        Age = readLine()!!.toInt()
    }
    fun EnterWeight(){
        println("Введите вашу массу(в кг):")
        Weight = readLine()!!.toDouble()
    }
    fun EnterHeight(){
        println("Введите ваш рост(в сантиметрах):")
        Height = readLine()!!.toDouble()
    }

    fun EnterSex(){
        println("Введите ваш пол:")
        Sex = readLine()!!.toString()
    }
    fun CheckLoginAndPassword(){
        println("Введите логин и пароль:")
        if (Login == readLine()!!.toString() && (Password == readLine()!!.toString())) {
            println("Ваш пароль верен")
            display()
        }
        else
            println("Неверный логин и/или пароль")
    }
    fun display(){
        println("Ваше имя:"+ " " +Name)
        println("Ваш возраст:"+ " " +Age)
        println("Ваш пол:"+ " " + Sex)
        println("Ваш рост:"+ " " +Height + " " + "см")
        println("Ваша масса:"+ " " +Weight+ " " + "кг")
    }
}