package hello;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int x;
		int a;
		String polynomial;
		
		int[] coefficient1 = new int[101];
		int[] coefficient2 = new int[101];
		int[] sum = new int[101];
		
		for(int i=1; i<3; i++)
		{
			do{
				x = in.nextInt();
				a = in.nextInt();
				if(i==1)
				{
					coefficient1[x] = a;	
				}
				else
				{
					coefficient2[x] = a;
				}
			}while(x != 0);
		}
		
		
		for(int j=0; j<101; j++)
		{
			sum[j] = coefficient1[j] + coefficient2[j];
		}
		
		for(int k=0; k<101; k++)
		{
			polynomial = sum[k]+"x"+k;
		}
		
		System.out.println(Arrays.toString(coefficient1));
		System.out.println(Arrays.toString(coefficient2));
		System.out.println(Arrays.toString(sum));
		
		for(int l=0; l<polynomial.length(); l++)
		{
			System.out.println(polynomial.charAt(l));	
		}		
	}
}


























