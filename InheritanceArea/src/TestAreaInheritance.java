
public class TestAreaInheritance
{
	public static void main(String args[])
	{
		Shape s=null;

		s=new Circle(3);
		s.findArea();
		s=new Tringle(2,3);
		s.findArea();
	}
}
