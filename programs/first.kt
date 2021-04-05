package com.ltts.kotlinfirst
import java.util.*


fun main(args: Array<String>)
{
    val sc=Scanner(System.`in`)
    println("enter two numbers")
    var x=sc.nextInt()
    var y=sc.nextInt()
    var z=0

    println("Press 1 for addition")
    println("Press 2 for substraction")
    println("Press 3 for multiplication")
    println("Press 4 for division")
    var c=sc.nextInt()

    if(c==1)
    {
        z=x+y
    }
    else if(c==2)
    {
        z=x-y
    }
    else if(c==3)
    {
        z=x*y
    }
    else if(c==4)
    {
        z=x/y
    }

    else{
        println("Invalid Input")
    }
    println("Result is $z")
}
