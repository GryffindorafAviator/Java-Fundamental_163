package shapes;

public class Vending_Machine {
	int price = 80;
	int balance;
	int total;
	
	Vending_Machine()
	{
		total = 0;
	}
	
	Vending_Machine(int price)
	{
		this();       //this method can call other construction function, but it can only be used inside the construction and must the first clause of the construction, and it can be used only once 
		this.price = price;
	}
	
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	
	void insertMoney(int amount)
	{
		balance = balance + amount;
	}
	
	void showBalance()
	{
		System.out.println(balance);
	}
	
	void getFood()
	{
		if(balance >= price)
		{
			System.out.println("Here you are.");
			balance = balance - price;
			total = total +price;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vending_Machine vm = new Vending_Machine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		Vending_Machine vm1 = new Vending_Machine(100);
		vm1.insertMoney(200);
		vm.showBalance();
		vm1.showBalance();
	}

}
