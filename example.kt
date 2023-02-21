package com.example.myapplication

//Inheritance in kotlin

    open class Person constructor(public val age: Int) {

        open fun talk(name: String) {
            val msg = "Hey $name. This is Person class of $age"
            println(msg)

        }

    }

    //Person has a constructor so we also need to make constructor in Teacher
    class Teacher constructor(age: Int) : Person(age) {

        override fun talk(name: String) {
            val msg = "Hey $name. This is teacher class of $age"
            println(msg)
        }

        fun teach() {
            println("Hey!!! I am ur new teacher")
        }
    }


    fun main(args: Array<String>) {

        val person: Person = Person(20)
        person.talk("Robo")

        var teacher: Teacher = Teacher(50)
        teacher.talk("Anand Sir")

        teacher = Teacher(55)
        teacher.talk("Rathi Sir")
        teacher.teach()

    }

