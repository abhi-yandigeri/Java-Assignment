package Day1;

public class Pali {

	public static void main(String[] args) {
		int no=1313;
		int temp=no;
		int rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+"is Palindrome");
		}
		else
		{
			System.out.println(no+"is not Palindrome");
		}

	}

}
