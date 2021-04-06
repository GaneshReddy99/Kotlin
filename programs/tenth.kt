fun main()
{
	var year = Integer.valueOf(readLine())
	

    if (year % 4 == 0) {

      
      if (year % 100 == 0) {

        
        if (year % 400 == 0)
          println("Leap Year")
        else
          println("Not a Leap Year")
      }
      
      
      else
        println("Leap Year")
    }
    
    else
      println("Not a Leap Year")

	
}
