package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.entity.Student
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    //    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root;
//        setContentView(view)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        var student = Student();
        student.age = "20"
        student.name = "张珊"
        binding.student = student
        // 延迟初始化的方案
//       lateinit var subeject:TestSubject()

    }

}

class MyClass {
    companion object {
        val myClassFiel1: Int = 1
        var myClassField = "this is MyClasss"
        fun companionFun1() {
            foo()
        }

        fun companionFun2() {
            companionFun1()
        }
    }

    fun MyClass.Companion.foo() {
        haha()
    }

    fun test2() {
        MyClass.foo()
    }

    init {
        test2()
        haha()
    }

    fun MyClass.haha() {

    }
}

val MyClass.Companion.no: Int
    get() = 10

fun MyClass.Companion.foo() {

}

class SingletonDemon private constructor() {
    companion object {
        private var instance: SingletonDemon? = null
            get() {
                if (null == field) {
                    instance = SingletonDemon()
                }
                return field
            }

        fun get(): SingletonDemon {
            return instance!!
        }
    }

    var ss = SingletonDemon.get()
    // 一种是对象表达式 另一种 对象生命
   // 线程是依赖操作系统的调度才能实现不同线程之间的切换，而协成却可以在变成语言
    //层面实现不同协程之间的切换，大大提升了编程运行效率
}
class User{
    var firestName: ObservableField<String> =ObservableField<String>()
    val lastName=ObservableField<String>()
    val age=ObservableInt()
// 去掉测试
    fun ceshi(){
        var user=User()
        user.firestName=ObservableField("dddd")
        val  age=user.age

    }

}

