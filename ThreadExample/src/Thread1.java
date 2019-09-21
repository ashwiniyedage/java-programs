 class Thread1
{
	int d;
	boolean flag=false;
	synchronized int getData()
	{
		if(flag==false)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception caught");
			}
		}
		System.out.println("got data"+d);
		flag=false;
		notify();
		return d;
	}
	synchronized void putData(int d)
	{
		if(flag==true)
		{
			try
			{
				wait();
			}
		catch(InterruptedException e)
		{
			System.out.println("Exception caught");
		}
		}
		this.d=d;
		System.out.println("put data with value"+d);
		flag=true;
		notify();
	}
}
