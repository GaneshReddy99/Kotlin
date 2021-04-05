import java.util.*
fun main(args: Array<String>) {
    var sc=Scanner(System.`in`)
    var x=sc.nextInt()
    prime(x)
    
}
fun prime(a:Int):Unit
{
    var l=ArrayList<Int>()
    var c=1
    var i=2
    while(c<=x)
    {
        var count=0
        for(j in 2..i/2)
        {
            if(i%j==0)
            {
                count=count+1
                break
            }
        }
        if(count==0)
        {
            l.add(i)
            c++
        }
        i++
    }
    for(j in l)
    {
        print(j)
        print(" ")
    }    
}
