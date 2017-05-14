package hello;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int integer = in.nextInt();
		int j = 0;
		int[] primes = new int[1000];
		int[] primeFactor = new int[integer];
		boolean[] isPrime = new boolean[1000];
		for(int i=0; i<isPrime.length; i++)
		{
			isPrime[i] = true;
		}
		
		for(int i=2; i<isPrime.length; i++)
		{
			if(isPrime[i])
			{
				for(int k=2; i*k<isPrime.length; k++)
				{
					isPrime[i*k] = false;
				}
			}
		}
		
		
		for(int i=2; i<=integer; i++)
		{
			if(isPrime[i])
			{
				if(integer%i == 0)
				{
					primeFactor[j] = i;
					integer /= i;
					j++;
					i = 1;
				}
			}
		}
		
//		for(int i=2; i<isPrime.length; i++)
//		{
//			if(isPrime[i])
//			{
//				primes[i] = i;
//			}
//		}
		
		
		
		System.out.println(Arrays.toString(primeFactor));
	}
}
