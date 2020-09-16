package pkg2;
import java.util.*;
public class D
{
	private double x,y;
	protected void getDimensions()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Length and Breadth of the rectangle  : ");
		x=sc.nextDouble();
		y=sc.nextDouble();
	}
	protected double sendArea()
	{
		return x*y;
	}

}
