
public class Thread2 extends Thread
{
	Thread1 t;
	public Thread2(Thread1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.call();
		/*synchronized(t)
		{
			t.call();
		}*/
	}
}
