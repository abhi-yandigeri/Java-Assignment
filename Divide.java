package Day1;

public class Divide {

	
	static void result(int N) 
	{	 
		// iterate from 0 to N 
		for (int num = 0; num < N; num++) 
		{	 
			// Short-circuit operator is used 
			if (num % 3 == 0 && num % 5 == 0 && num % 2==0) 
				System.out.print(num + " "); 
		} 
	} 
	

	public static void main(String []args) 
	{ 
		// input goes here 
		int N = 4; 
		
		
		result(N); 
}
}