package pkg2;
import pkg1.*;
class King
{
	public static void main(String args[])
	{
		A a=new A();
		a.setData(1,2,3);
		a.putData();
		B b=new B();
		b.setData(4,5);
		b.putData();
		C c=new C();
		c.getRadius();
		double k=c.sendArea();
		System.out.println("Your Circle's Area : "+k);
		D d=new D();
		d.getDimensions();
		double k1=d.sendArea();
		System.out.println("Your Rectangle's Area : "+k1);

	}
}
