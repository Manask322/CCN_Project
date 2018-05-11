//package loans;
package BasicOP ;

import java.util.Scanner;
interface mainloan
{
	abstract void check();
	abstract double calculate(int x,double y,int z);
	long get();
}
public class loan_op implements mainloan
{
	Scanner in= new Scanner(System.in);
	public void check()
	{
		System.out.println("Enter your base salary");
		long bs=in.nextLong();
	}
	public double calculate(int a,double b,int c)
	{
		double cal=(a*b*c)/100;
		cal=a+cal;
		return cal;
	}
	public long get()
	{
		System.out.println("Enter the amount of loan you want");
		long am=in.nextLong();
		return am;	
	}
}

/**
 *
 * @author manas
 */



