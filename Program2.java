package Day2;

public class Program2 {

	public static void main(String[] args) {
		
int a[]= {2,4,6,25,11,19,0,4};
		
		int findNumber=11;
		int flag=0;
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==findNumber)
			{
				index=i;
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
			if(flag==1)
				System.out.println("element is found at index"+index);
			else
				System.out.println("element is not found");
		
	}
}