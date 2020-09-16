package pkg2;
import java.util.*;
public class C
{
	private double r;
	protected void getRadius()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Radius : ");
		r=sc.nextDouble();
	}
	protected double sendArea()
	{
		return 3.14*(r*r);
	}

}
