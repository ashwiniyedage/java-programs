import java.util.*;
import java.util.Scanner;
public class Test1 
{
		public static void main(String args[])
		{
			Scanner sc =new Scanner(System.in);
			Trans t1=new Trans();
			int ch;
			String y;
			do
			{
				System.out.print("\n 1.Withdraw \n 2.Deposite \n 3.Exit");
				System.out.println("\n Enter your choice : ");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
						t1.withdraw();
						break;
				case 2:
						t1.deposite();
						break;
				default:System.out.println("\n Invalid choice");
				}
				System.out.println("Do you want to continue : ");
				y=sc.next();
			}while(y.equals("yes"));
			
		}
}
