package Collection;

import java.util.Scanner;

public class Star_thinkitive {

	public static void main(String[] args)
	{
		int i,j,k,kk;
		
		for( i=0;i<=4;i++)
		{
			for( j=i;j<4;j++)
			{
				System.out.print(" ");
			}
			for( k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			
			for( kk=1;kk<=i;kk++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}	
	
	}
}