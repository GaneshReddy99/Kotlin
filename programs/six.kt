fun main()
{
	var array = arrayOf(6,3,8,5)
	var lambda = {->
		var rev = array.sorted()
		println("The Smallest Element is ${rev[0]}")
		println("The Largest Element is ${rev[array.size-1]}")
	}
	lambda()
}
