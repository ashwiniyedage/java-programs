
public class TestThread
{
	public static void main(String args[])
	{
		System.out.println("Welcome..");
		//Demo t1=new Demo(5,2);
		Student s=new Student();
		Demo t1=new Demo(args,s);//using cmd line argument
		System.out.println(t1.isAlive());
		t1.start();//runnable
		System.out.println(t1.isAlive());
		System.out.println("Thank you..");
	}
}
