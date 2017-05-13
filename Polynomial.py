package hello;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int x;
		int a;
		int m = 0;
		int digits = 101;
		String polynomial = "";
		 
		int[] coefficient1 = new int[digits];
		int[] coefficient2 = new int[digits];
		int[] sum = new int[digits];
		
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
		
		
		for(int j=0; j<digits; j++)
		{
			sum[j] = coefficient1[j] + coefficient2[j];
		}
		
		for(int k=35-1; k>=0; k--)
		{
			if(k>1 && sum[k]!=0)
			{
				if(sum[k]==1)
				{
					polynomial = "x" + k;
					m = k-1;
					break;
				}
				else if(sum[k]==-1)
				{
					polynomial = "-x" + k;
					m = k-1;
					break;
				}
				else
				{
					polynomial = sum[k] + "x" + k;
					m = k-1;
					break;
				}
			}
			
			else if(k==1 && sum[k]!=0)
			{
				if(sum[k]!=1 && sum[k]!=-1)
				{
					polynomial = sum[k] + "x";
					m = k-1;	
					break;
				}
				else if(sum[k]==1)
				{
					polynomial = "x";
					m = k-1;	
					break;
				}
				else
				{
					polynomial = "-x";
					m = k-1;	
					break;
				}
				
			}
				
			else if(k==0)
			{
				if(sum[k]!=0)
				{
					polynomial = sum[k] + "";
					m = -1;
				}
				else
				{
					polynomial = "0";
					m = -1;
				}
			}
		}
		
		for(int k=m; k>=0; k--)
		{
			if(k>1)
			{
				if(sum[k]>0 && sum[k]!=1)
				{
					polynomial = polynomial + "+" + sum[k] + "x" + k;
				}
				else if(sum[k]==1)
				{
					polynomial = polynomial + "+" + "x" + k;
				}
				else if(sum[k]<0 && sum[k]!=-1)
				{
					polynomial = polynomial + sum[k] + "x" + k;
				}
				else if(sum[k]==-1)
				{
					polynomial = polynomial + "+" + "-x" + k;
				}
			}
			
			else if(k==1)
			{
				if(sum[k]>0 && sum[k]!=1)
				{
					polynomial = polynomial + "+" + sum[k] + "x";
				}
				else if(sum[k]==1)
				{
					polynomial = polynomial + "+" + "x";
				}
				else if(sum[k]<0 && sum[k]!=-1)
				{
					polynomial = polynomial + sum[k] + "x";
				}
				else if(sum[k]==-1)
				{
					polynomial = polynomial + "+" + "-x";
				}
			}
			
			else if(k==0)
			{
				if(sum[k]>0)
				{
					polynomial = polynomial + "+" + sum[k];
				}
				else if(sum[k]<0)
				{
					polynomial = polynomial + sum[k];
				}
				else if(polynomial != "")
				{
					polynomial = polynomial + "";
				}
				else
				{
					polynomial = "0";
				}
			}		
		}
		
		System.out.println(polynomial);
		
//		String z = Arrays.toString(sum); 
//		System.out.println(z);		
//		System.out.println(Arrays.toString(coefficient1));
//		System.out.println(Arrays.toString(coefficient2));
//		System.out.println(Arrays.toString(sum));

		
//		for(int l=0; l<polynomial.length(); l++)
//		{
//			System.out.println(polynomial.charAt(l));	
//		}		
	}
}
