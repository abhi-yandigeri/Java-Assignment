package Day1;
import java.util.Scanner;

public class numpyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,j;
		System.out.println("Enter no. of rows");
		n=sc.nextInt();
		for(;n>=1;n--)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
	}

}
