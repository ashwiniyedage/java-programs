//create a class grandfather declare variable age  and declare paramatric constroctor to initialise the age 
//show age method to display the garandfather age same structure for father class and son class create a main class testage and
//create a obejet od son class pass the age 20 and call show in method son class 
public class Grandfather 
{ 		
	int age;
	public Grandfather(int age)
	{
		this.age=age;
	}
	 public void show()
	{
		 System.out.println("\n Grandpa age : "+age);
	}
}
class Father extends Grandfather 
{
	int age;
	public Father(int age)
	{ 	
		super(age+30);
		this.age=age;
	}
	public void show()
	{
		super.show();
		System.out.println("\n Father age : "+age);
	}
}
class Son extends Father
{
	int age;
	public Son(int age)
	{
		super(age+30);
		this.age=age;
	}
	public void show()
	{
		super.show();
		System.out.println("\n Son age : "+age);
	}
}