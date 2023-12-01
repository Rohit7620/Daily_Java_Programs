/*
 Write a Java code for print pattern
 
      *
     ***
    *****
   *******
  *********

 */

package NestedLoopPattern;

public class PyramidPattern 
{
	public static void main(String[] args) 
	{
		int i,j,k;
        for(i=0;i<5;i++)
        {
            for(j=5-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(k=0;k<i*2+1;k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
