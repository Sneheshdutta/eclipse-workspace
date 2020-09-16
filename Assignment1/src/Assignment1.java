import java.util.*;
class Area
{
	double l,b;
	void setDim(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	double getArea()
	{
		return l*b;
	}
}
class Assignment1
{
	public static void main(String args[])
	{
		double l,b,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("* Rectangle Parameters *");
		System.out.print("Enter Length Value : ");
		l=sc.nextDouble();
		System.out.print("Enter Breadth Value : ");
		b=sc.nextDouble();
		Area r=new Area();
		r.setDim(l,b);
		a=r.getArea();
		System.out.println("The Computed Area is : "+a);	
	}
}