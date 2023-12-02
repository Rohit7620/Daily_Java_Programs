/* 
 Write a program to perform the choice
1:Sum of digit
2:Prime No
3:Fibonacci series
Using Function

*/

package Functions;
import java.util.*;
public class Functionoperation1 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;//declare choice varibale for user choice
		System.out.println("Enter Your Choice For Opearations \n 1:Sum of digit \n 2:Prime No \n 3:Fibonacci series");
		choice=sc.nextInt();//Accept Choice From User
		switch(choice)
		{
		case 1:
			Sumofdigit();
			break;
			
		case 2:
			primeno();
			break;
			
		case 3:
			Fiboseries();
			break;
			
		default:
			System.out.println("Invalid Choice");
		}
				
	}
	
	//Function for calculate Sum Of digits.
	public static void Sumofdigit()
	{
		int sum=0;
		int num;// Declaring number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		num=sc.nextInt();//Accepting number from user
		while(num!=0)
		{
			sum += num % 10;// Get the last digit and add to sum
            num /= 10;// Remove the last digit from the number
		}
		System.out.println("Sum of Digits : " + sum);//Print the sum of digits
		
	}
	
	//Function for Prime number
	public static void primeno()
	{
		Scanner sc = new Scanner(System.in);
		int num;
		int count=0;//
		System.out.println("Enter The Number =");
		num=sc.nextInt();//Accepting number form user.
		for(int i =1; i<=num; i++)
        {
        	if(num%i==0)
        	{
        		count++;
        	}
        }
        if(count==2)
        {
        	System.out.println(num+ " " + "is a Prime Nnmber");
        }
        else
        {
        	System.out.println(num+ " " + "is not a Prime Nnmber");
        }
		
	}
	
	
	//Function to print Fibonacci Series
	public static void Fiboseries()
	{
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter A Number you want to print Fibonacci Series =");
		int size=sc.nextInt(); // The number of terms in the Fibonacci series to print
		int firstTerm;
        int secondTerm;
		int nextTerm;
		
		//Take the First Term from user 
		System.out.println("Enter First Term =");
		firstTerm=sc.nextInt();
		
		//Take the First Term from user 
		System.out.println("Enter second Term =");
		secondTerm=sc.nextInt();

        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

        for (int i = 1; i < size - 1; ++i) 
        {
            nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
	}

}
