
public class Homework {
	
	public static int sum(int a, int b)
	{
		int i;
		int sum = 0;
		for(i=a; i<=b; i++)
		{
			sum += i;
		}
		System.out.println("The sum from a to b is: " + sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(1, 10);
		sum(20, sum(1,10));
		sum(30, 45);
	}
}
