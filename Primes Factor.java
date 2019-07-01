package hello;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int integer = in.nextInt();
		int a = integer;
		int j = 0;
		String output = "";
		int[] primes = new int[100000];
		int[] primeFactor = new int[integer];
		boolean[] isPrime = new boolean[primes.length];
		
//		set each cell of array isPrime to true
		for(int i=0; i<isPrime.length; i++)
		{
			isPrime[i] = true;
		}
		
//		construct primes table
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
		
//		find out prime factors of arbitrary integer
		for(int i=2; i<=integer; i++)
		{
			if(isPrime[i])
			{
				if(integer == i)
				{
					primeFactor[j] = i;
					break;
				}
				if(integer%i == 0)
				{
					primeFactor[j] = i;
					integer /= i;
					j++;
					i = 1;
				}
			}
		}

		for(int i=0; i<primeFactor.length; i++)
		{
			if(primeFactor[i]!=0)
			{
				if(i==0)
				{
					output = primeFactor[i] + "";
				}
				else if(i>0)
				{
					output = output + "x" + primeFactor[i];
				}
			}
		}
//		System.out.println(Arrays.toString(primeFactor));
		System.out.println(a + "=" + output);
	}
}







