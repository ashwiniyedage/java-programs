
public class ThreadDemo 
{
	public static void main(String args[])
	{
		Addition a1=new Addition();
		Demo t1=new Demo(a1);
		
		//System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
		
	}
}
