
public class TestInstrument
{
	public static void main(String args[])
	{
		
		Instrument arr[]=new Instrument[3];
		arr[0]=new Piano();
		arr[1]=new Flute();
		arr[2]=new Gitar();
		for(Instrument x:arr)
		{
			x.play();
		}
	/*Instrument i=null;
	i=new Piano();
	i.play();
	i=new Flute();
	i.play();
	i=new Gitar();
	i.play();*/
	}
	
}
