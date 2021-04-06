fun main()
{
	var num = Integer.valueOf(readLine())
	var fact = {x:Int ->
		var sum = 1
		for(i in 1..x)
			{
				sum = sum*i
			}
		println("The Factorial of a ${x} is ${sum}")
	}
	fact(num)
}
