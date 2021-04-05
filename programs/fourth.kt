fun main()
{
    var quanti=Integer.valueOf(readLine())
    var up=Integer.valueOf(readLine())
    var t=quanti*up
    var discount:Float= ((t*15)/100)
    var finalbill=t-discount
    println("The discount amount is: $discount")
    println("The final bill amount is: $finalbill")
}
