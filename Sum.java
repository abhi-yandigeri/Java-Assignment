package Day1;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numer");
		n=sc.nextInt();
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("Sum of digits are " + sum);

	}

}
