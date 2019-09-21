
class Demo extends Thread
{
		Addition a1;
	public Demo(Addition a1)
	{
		this.a1=a1;
		System.out.println("Demo...");
	}
	public void run()
	{
		a1.add();
		display();
		System.out.println("Running...");
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception caught");
		}
		System.out.println("Example of Thread");
	
	}
	public void display()
	{
		System.out.println("Hiii....");
	}
}
