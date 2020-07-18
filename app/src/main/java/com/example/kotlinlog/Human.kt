package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class Human: Animal, Thinkable{

    var hobby: String

    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlintest", "「私の名前は"+ this.name + "です。" + "年は" + this.age + "です。」”")
    }

    // Thinkableインタフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", this.name + "「私は" + hobby +"について考える。」")
    }

}