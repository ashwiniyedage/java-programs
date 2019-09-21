
public class Circle extends Shape
{
	private double area;
	private int r;
	
	
	public Circle( int r)
	{
		super();
		//this.area = area;
		this.r = r;
	}


	public void findArea()
	{
		area=3.14*r*r;
		System.out.println("\n Area of circle : "+area);
	}
}
