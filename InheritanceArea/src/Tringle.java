
public class Tringle extends Shape
{
	private double tarea;
	private int b;
	private int h;
	public Tringle( int b, int h) {
		super();
		//this.tarea = tarea;
		this.b = b;
		this.h = h;
	}
	public void findArea()
	{
		tarea=0.5*b*h;
		System.out.println("\n Area if tringle : "+tarea);
	}
	
}
