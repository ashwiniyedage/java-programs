
public class Biryani implements Food {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Biryani";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 200.00;
	}

	@Override
	public String toString() {
		return "Biryani name : "+getName()+"\n Biryani price : "+getPrice();
	}
	
}
