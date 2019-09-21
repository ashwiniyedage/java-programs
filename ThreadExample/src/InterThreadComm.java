
public class InterThreadComm
{
	public static void main(String args[])
	{
		Thread1 obj1=new Thread1();
		Producer p=new Producer(obj1);
		Consumer c=new Consumer(obj1);
		System.out.println("Press ctrl+c to stop");
	}
}
