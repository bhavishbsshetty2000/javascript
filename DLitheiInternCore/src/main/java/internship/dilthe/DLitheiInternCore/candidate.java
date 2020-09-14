package internship.dilthe.DLitheiInternCore;

import java.util.Arrays;
import java.util.Scanner;

public class candidate 
{
	private Double sum=0.0;
	private Double[] yet;
	private Scanner scan=new Scanner(System.in);
	public candidate()
	{
		System.out.println("Default constructor");
		System.out.println("Please set the size of array");
		int size=scan.nextInt();
		this.yet=new Double[size];
		//this.sum=0.0;
		System.out.println("initialization done");
	}
	public candidate(Double[] temp)
	{
		System.out.println("Parameter constructor with double array recieved");
		this.yet=temp;
		//this.sum=0.0;
		System.out.println("copied double array");
	}
	public candidate(Integer[] temp)
	{
		System.out.println("Parameter constructor with int array recieved");
		this.yet=new Double[temp.length];
		//this.sum=0.0;
		for(Integer index=0;index<yet.length;index++)
		{
			yet[index]=(double)(temp[index]);
		}
	}
   public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Double[] getYet() {
		return yet;
	}

	public void setYet(Double[] yet) {
		this.yet = yet;
	}
    public void findingSum()
    {
    	for(Double temp:this.yet)
    	{
    		this.sum+=temp;
    	}
    }
    

	@Override
	public String toString() {
		return "candidate [sum=" + sum + ", yet=" + Arrays.toString(yet) + "]";
	}

public static void main(String[] args) {
     candidate can1=new candidate();
     Double[] local= {12.7,54.34,2.34,23.324};
     can1.setYet(local);
     can1.findingSum();
     System.out.println(can1);
     
     candidate can2=new candidate(new Double[] {1.2,1.3,43.2,1.5}); 
     can2.findingSum();
     System.out.println(can2);
     
     candidate can3=new candidate(new Integer[] {1,3,43,5}); 
     can3.findingSum();
     System.out.println(can3);
     }
}

	

