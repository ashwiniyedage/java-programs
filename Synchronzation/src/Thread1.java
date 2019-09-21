
public class Thread1
{
	synchronized void call()
	{
		System.out.println("First statement");
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
		System.out.println("Second statement");
	}
}
