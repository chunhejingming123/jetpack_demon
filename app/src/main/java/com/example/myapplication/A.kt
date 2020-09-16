package com.example.myapplication

open class A(var name: String, var age: Int) {
    open var sex: String = "unkonw"
    var aaa: Int = 0
        get() {
            field
            return 0
        }
    set(value) {}

    init {
        println("积累初始化")
    }
}

class Student(var names: String, age: Int, var sexs: String) : A(names, age) {

}
interface  MyInterface{
    fun bar()
    fun foo()

}
// 扩展是一种静态行为，对被扩展的类代码本身不会造成影响
