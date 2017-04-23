package hello;

import java.util.Scanner;

public class JF_3_3_2_PrimeLessThan100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		for ( int n = 2; n < 100; n++)
		{
		    int isPrime = 1;
			for (int i = 2; i < n; i++)
			{
				if ( n % i == 0)
				{
					isPrime = 0;
					break;
				}
			}
			
			if ( isPrime == 1)
			{
				System.out.print(n + " ");
			}
			else
			{
//				System.out.println(n + "is not prime");
			}
		}
	}

}
