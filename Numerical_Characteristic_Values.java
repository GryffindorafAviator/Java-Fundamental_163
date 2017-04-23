package hello;

import java.util.Scanner;

public class Numerical_Characteristic_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int remainder = a % 10;
		int remainderWhole = a / 10;
		int count = 0;
		int bDigit;
		int compareRemainder;
		int compareCount;
		int result = 0;
		
		while(remainder!=0 || remainderWhole!=0)
		{
			count++;
			compareRemainder = remainder % 2;
			compareCount = count % 2;
			
			if(compareRemainder == compareCount)
			{
				bDigit = 1;
			}
			else
			{
				bDigit = 0;
			}
			
			result = result + bDigit * (int)(java.lang.Math.pow(2,(count-1)));
			
			remainder = remainderWhole % 10;
			remainderWhole = remainderWhole / 10;
		}
		
		System.out.println(result);

	}

}
