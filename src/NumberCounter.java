
public class NumberCounter {

	public static void main(String[] args)
	{
		int count = 0; 
		for(int i=1; i<=1000000; i++)
		{
			
			if(i % 9 ==0 || i % 13 ==0 || i % 27 == 0 || i % 81 == 0)
			{
             System.out.println("Count is: " + i);
             count = count + 1;
	}
        
	}
		System.out.println("The number of numbers between 1 and 1 mil, divisible by 9, 13, 27 and 81 is: "  + count);
	}
}

