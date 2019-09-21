
public class Pavbhaji implements Food {

	@Override
	public String getName()
	{
		// TODO Auto-generated method stub
		return "Pavbhaji";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 50.00;
	}

	@Override
	public String toString() {
		return "Pavbhaji name : "+getName()+"\n Pavbhaji Price : "+getPrice();
	}
	
}
