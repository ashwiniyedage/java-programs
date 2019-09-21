import java.util.*;
public class Trans
{
	private int min=1000;
	private double balance=50000;
	private int ammount;

	/*public Trans(int min, double balance, int ammount)
	{
		//super();
		this.min = min;
		this.balance = balance;
		this.ammount = ammount;
	}*/
	Scanner sc=new Scanner(System.in);
	
	public void withdraw()
	{	
		if(ammount>min)
		{
			System.out.println("\n Your balance is too low");
			System.out.println("Transaction is failed");
		}
		else
		{
			System.out.println("\n Your balance is :"+balance);
			System.out.println("\n Enter the ammount to be withdraw : ");
			ammount=sc.nextInt();
			balance=balance-ammount;
			System.out.println("\n Successfully Withdraw :"+ammount);
			System.out.println("\n Your current balance :"+balance);
			//System.out.println("\n Thank you.....");
			//return balance;
		}
	}
	public double deposite()
	{
			//System.out.println("\n Your balance : "+balance);
			System.out.println("\n Enter the Ammount to be deposite : ");
			ammount=sc.nextInt();
			balance=balance+ammount;
			System.out.println("\n Successfully deposited...");
			System.out.println("\n Your Current balance : "+balance);
			return balance;
	}
	
}
