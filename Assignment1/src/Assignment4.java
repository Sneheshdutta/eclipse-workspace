class Parent
{   void method1()
	{
		System.out.println("This is parent Class");
	}
}
class Child extends Parent
{
	void method2()
	{
		System.out.println("This is child Class");
	}
}
class Assignment4
{
	public static void main(String args[]) 
	{ 
        Parent obj1=new Parent();
        obj1.method1();
        Child obj2=new Child();
        obj2.method2();
       Child obj3=new Child();
        obj2.method1(); 
		
	}
}