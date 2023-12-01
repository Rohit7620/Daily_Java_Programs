/*
 Write a Java code for print

10101
0101
101
01
1

 */

package NestedLoopPattern;
public class Tooglepattern 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			int value=i%2==0 ? 0 : 1;
			for(int j=5;j>=i;j--)
			{
				System.out.print(value);
				value=1-value;//Toggle between 0 and 1
			}
			System.out.println();
		}
	}

}
