
public class Manager extends Employee 
{
	private int bounus;

	public Manager(int eid, String name, int sal, int bounus)
	{
		super(eid, name, sal);
		this.bounus = bounus;
	}

	public int getBounus()
	{
		return bounus;
	}

	@Override
	public String toString() {
		return "Manager \n Manager bounus=" + bounus + ", \n Manager ID=" + getEid() + ", \n Manager Name=" + getName() + ", Manager Salary="
				+ getSal() + "";
	}

	
	
}
