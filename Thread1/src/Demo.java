
public class Demo extends Thread
{
		//int n1,n2;
		String str[];
		Student s;
	public Demo(String str[],Student s)
	{
		//this.n1=n1;
		//this.n2=n2;
		this.str=str;
		this.s=s;
		System.out.println("Demo...");
	}
	public void run()
	{
		s.display();
		add();
		System.out.println("Running..");
	}
	public void add()
	{
		/*int add;
		add=n1+n2;*/
		int sum=0;
		for(int i=0;i<str.length;i++)
		{
				System.out.println(str[i]);
				sum=sum+Integer.parseInt(str[i]);
		}

		System.out.println("Addition is :"+sum);
	}
}
