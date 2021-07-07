package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int x;
		double sum = 0;
		int cnt = 0;
		cnt = in.nextInt();
		if (cnt>0)
		{
			int[] numbers = new int[cnt];
			for (int i=0; i<numbers.length; i++)
			{
				numbers[i] = in.nextInt();
				sum += numbers[i];
			}
			double average = sum/cnt;
			for (int i =0; i<cnt; i++)
			{
				if(numbers[i]>average)
				{
					System.out.println(numbers[i]);
				}
			}
			System.out.println(sum/cnt);
		}
	}
}
