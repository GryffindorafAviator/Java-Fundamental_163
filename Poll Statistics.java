import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int x;
		int[] numbers = new int[10];
		x = in.nextInt();
		while (x!=-1)
		{
			if (x>=0 && x<=9)
			{
				numbers[x] ++;
			}
			x = in.nextInt();
		}
		for (int i=0; i<numbers.length; i++)
		{
			System.out.println(i+":"+numbers[i]);
		}
	}
}
