
class Consumer implements Runnable
{
	Thread1 t;
	public Consumer(Thread1 t)
	{
		this.t=t;
		new Thread(this,"Consumer").start();
		System.out.println("Get called by consumer");
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
	
