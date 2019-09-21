
public class TestEmployee
{
	public static void main(String args[])
	{
		Manager m1=new Manager(23,"Ashwini",20000,5000);
		System.out.println("\n ----------------------------Manager Information--------------------------------");
		System.out.println(m1);
		/*System.out.println("\n Manager ID : "+m1.getEid());
		System.out.println("\n Manger Name : "+m1.getName());
		System.out.println("\n Manager Salary : "+m1.getSal());
		System.out.println("\n Bounus : "+m1.getBounus());*/
		
		Developer d1=new Developer(24,"Yami",30000,4);
		System.out.println("\n ----------------------------Developer Information--------------------------------");
		System.out.println(d1);
		/*System.out.println("\n Developer ID : "+d1.getEid());
		System.out.println("\n Developer Name : "+d1.getName());
		System.out.println("\n Developer Salary : "+d1.getSal());
		System.out.println("\n working hours : "+d1.getHours());*/
		
	}
}
