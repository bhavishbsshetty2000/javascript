package internship.dilthe.DLitheiInternCore;

public class Deriving extends Factorial
{
	public void findMax()
	{
		Integer fmin=price[0],smin=price[0];
		for(Integer temp1:price)
		{
			if(temp1<fmin)
			{
				smin=fmin;
				fmin=temp1;
			}
			else if(temp1<smin&&temp1!=fmin)
			{
				smin=temp1;
			}
		}
		System.out.println("second min is "+smin);
	}
    public static void main(String[] args) {
    	Deriving f=new Deriving();
    	f.price=new Integer[] {12,5,7,2,3,9,10};
    	f.findMax();
    	f.fact();
		
	}
}

class Sum{
	Integer price[],sum=0;
	public void findMax()
	{
		Integer max=price[0];
		for(Integer temp:price)
		{
			sum+=temp;
			if(max<temp)
			{
				max=temp;
			}
		}
		System.out.println("Max value:"+max);
		System.out.println("Sum value:"+sum);
	}
}

class Factorial extends Sum
{
	public void fact()
	{
		for(Integer temp:price)
		{
			//fact
			Integer factval=1;
			for(int num=temp;num>0;num--)
			{
				factval=factval*num;
			}
			System.out.println(temp+" factorial is "+factval);
		}
		super.findMax();
	}
	
}