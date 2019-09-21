
public class TestFood {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Food f1=null;
		f1=new Pavbhaji();
		System.out.println(f1);
		
		//display(f1,"Pavbhaji");
		
		f1=new Biryani();
		System.out.println(f1);
		
		//display(f1,"Biryani");
		/*System.out.println("Name of food : "+f1.getName());
		System.out.println("Price of food : "+f1.getPrice());
		
		Food f2=null;
		f1=new Biryani();
		System.out.println("Name of food : "+f1.getName());
		System.out.println("Price of food : "+f1.getPrice());*/
	}
	/*public static void display(Food f1,String str)
	{
		System.out.println("---------------------------------------");
		System.out.println(str+" Name : "+f1.getName());
		System.out.println(str+" Price: "+f1.getPrice());
	}*/
}
