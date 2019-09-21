
public class Producer implements Runnable
{
	Thread1 t;
	public Producer(Thread1 t)
	{
			this.t=t;
		new Thread(this,"Producer").start();
		System.out.println("put called by producer");
	}
	public void run()
	{
		int data=0;
		while(true)
		{
			data=data+1;
			t.putData(data);
			
		}
	}
}
