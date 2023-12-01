package PracticeCode;
import java.util.*;
public class Minmax 
{

	public static void main(String[] args) 
	{
		int min,max,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of Minimum number =");
		min=sc.nextInt();
		System.out.print("Enter the value of Maximumm number =");
		max=sc.nextInt();
		for(i=min;i<=max;i++)
		{
			System.out.println("Numbers Between Minimum and Maximum ="+i);	
			if(i%2==0)
			{
				System.out.println("Even Numbers="+i);
			}
			else
			{
				System.out.println("Odd Numbers ="+i);
			}
			
		}
		System.out.println("Smallest Number is ="+min);
		System.out.println("Greatest Number is ="+max);
		
		

	}

}
