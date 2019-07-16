package hello;

import java.util.Scanner;

public class Sum_of_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int i;
		int j;
		int I;
		int J = 1;
		int minPrime;
		int maxPrime;
		int count = 0;
		int sum = 0;
		
		while(count<n)
		{
			boolean isPrime = true;
			J++;
			
			for(I=2; I<J; I++)
			{
				if(J%I==0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				count++;
			}
			
		}
		
		minPrime = J;
		
		while(count<m)
		{
			boolean isPrime = true;
			J++;
			
			for(I=2; I<J; I++)
			{
				if(J%I==0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				count++;
			}
			
		}
		
		maxPrime = J;
				
		for(j=minPrime; j<=maxPrime; j++)
		{
			boolean isPrime = true;
			
			for(i=2; i<j; i++)
			{
				if(j%i == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				sum = sum + j;
			}
		}
		
		System.out.println(sum);
	}
}




