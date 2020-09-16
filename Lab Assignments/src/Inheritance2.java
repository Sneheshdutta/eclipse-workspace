class Shape
{
	String color;
	boolean filled;
	Shape()
	{
	
		color = "Green";
		filled = true;
	}
	Shape(String color,boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	public String getColor()
	{
		return color;
	}
        public void setColor(String color)
        {
                this.color = color;
        }
	public boolean getFilled()
	{
		return filled;
	}
	public void setFilled(boolean a)
        {
                filled = a;
        }
	public String toString()
	{
		return("\nColor: "+color+" Filled :"+filled);
	}
}

class Circle extends Shape
{
	double r;
	Circle()
	{
		super();
		r = 1.0;
	}
	Circle(String color,boolean filled)
        {
                super(color,filled);
        }
	Circle(String color,boolean filled,double r)
        {
		super(color,filled);
                this.r = r;
        }
	public double getRad()
	{
		return r;
	}
	public void setRad(int r)
	{
		this.r = r;
	}
	public double calPeri()
	{
		return 2*3.14*r;
	}
	public double calArea()
	{
		return 3.14*r*r;
	}
	public String toString()
        {
                return("\nA Circle with radius "+r+"which is a subclass of Shape "+super.toString());
        }

}

class Rectangle extends Shape
{
	double l,b;
	Rectangle()
	{
		super();
		l = b = 1.0;
	}
	Rectangle(String color,boolean filled)
        {
                super(color,filled);
        }
	Rectangle(String color,boolean filled,double l,double b)
        {
		super(color,filled);
                this.l = l;
		this.b = b;
        }
	public double getL()
	{
		return l;
	}
	public double getB()
        {
                return b;
        }
	public void setL(int l)
	{
		this.l = l;
	}
	public void setB(int b)
        {
                this.b = b;
        }
	public double calPeri()
	{
		return 2*(l+b);
	}
	public double calArea()
	{
		return l*b;
	}
	public String toString()
        {
                return("A Rectangle with width "+b+" and length "+l+" , which is a subclass of Shape "+super.toString());
        }
}
class Square extends Rectangle
{
	Square()
	{
		super();
	}
	Square(String color,boolean filled,double s)
	{
		super(color,filled,s,s);
	}
	public String toString()
	{
		return("A Square with side"+super.l+", which is a subclass of "+super.toString());
	}
}

class Inheritance2
{
	public static void main(String []args)
	{
		Shape shp=new Shape();
		shp.setColor("Black");
		shp.setFilled(true);
		System.out.println(shp);
		Rectangle rect=new Rectangle("Blue",false,20.1,15.2);
		System.out.println(rect);
	}
}
