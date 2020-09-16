package internship.dilthe.DLitheiInternCore;

public class copy extends finale  implements Apple
{
   public static void main(String[] args) {
	copy cpy=new copy();
	cpy.list();
	Apple.teller();
	cpy.update();
	cpy.display();
	
}

@Override
public void update() {
	// TODO Auto-generated method stub
	crew[0]="tom";
	
}
}
class finale
{
	Double[] dub= {12.4,6.5,63.2,1.4,11.3};
	public void list()
	{
		for(Double temp:dub)
		{
			System.out.println(temp);
		}
	}
}
interface Apple
{
	String[] crew= {"raj","goali","joy","roy"};
	String skipper=crew[1];
	public default void display()
	{
		for(String temp:crew)
		{
			System.out.println(temp);
		}
	}
	public static void teller() {
	
		for(String temp:crew)
		{
			if(temp.contains("a"))
			{
			System.out.println(temp);
		}
		}
	}
	public void update();
}
