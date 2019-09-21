
public class Developer extends Employee
{
	private int hours;

	public Developer(int eid, String name, int sal, int hours)
	{
		super(eid, name, sal);
		this.hours = hours;
	}

	public int getHours() 
	{
		return hours;
	}

	@Override
	public String toString() {
		return "Developer \n Working hours=" + hours + ", \n Developer ID=" + getEid() + ", \n Developer Name=" + getName() + ",\n Developer Salary="
				+ getSal() +  "";
	}

	

	
	
	
}
