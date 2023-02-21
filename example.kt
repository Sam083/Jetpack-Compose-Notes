package com.example.myapplication

class example constructor(val age: Int) {

    fun talk(name: String)
    {
        val msg = "Hey $name. How are you buddy!!!just to let you know age $age is just a no"
        println(msg)

    }

}
fun main(args: Array<String>)
{
    val sample: example = example(22)
    sample.talk("Samarth")
}
