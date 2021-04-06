import java.util.*
fun main(args: Array<String>) {
    var sc=Scanner(System.`in`)
    var x=sc.nextInt()
    palindrome(x)
    
}
fun palindrome(a:Int):Unit
{
    var i=1
    var count=1
    var l1=ArrayList<Int>()
     l1.add(0)
    while(count<=a-1)
    {
        var i1=i
        var j=1
        var s=0
        while(i>0)
        {
            var r=i%10
            s=s*10+r
            i=i/10
        }
        if(i1==s){
            l1.add(i1)
            count++
        }
        i=i1+j
    }
    for(k in l1)
    {
        print(k)
        print(" ")
    }
}
