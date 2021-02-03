package Day1;
import java.util.*;
	class Color
{
		public static void main(String args[])throws Exception
{
			char ch;
			System.out.println("enter color code in VIBGYOR ");
			ch=(char)System.in.read();
			switch(ch)
			{
			case 'v':
				System.out.println("Violet");
				break;
			case 'i':
				System.out.println("Indigo");
				break;
			case 'b':
				System.out.println("Blue");
				break;
			case 'g':
				System.out.println("Green");
				break;
			case 'y':
				System.out.println("Yellow");
				break;
			case 'o':
				System.out.println("Orange");
				break;
			case 'r':
				System.out.println("Red");
				break;
			default:
				System.out.println("labled color code");
				break;
			}
	}
}

