
public class SynchronizedThreads {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Thread1 obj1=new Thread1();
		Thread2 obja=new Thread2(obj1);
		Thread2 objb=new Thread2(obj1);
		obja.start();
		objb.start();
	}

}
