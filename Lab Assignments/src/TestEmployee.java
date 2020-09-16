import java.util.*;
class Employee
{
	String name,address;
	int ID;
	Employee()
	{
		name=null;
		address=null;
		ID=0;
	}
	Employee(String name,String address,int ID)
	{
		this.ID=ID;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Address = "+address);
		System.out.println("ID = "+ID);
	}
}

class TestEmployee
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name of the Employee: ");
		String nm=sc.nextLine();
		System.out.print("Enter Address of the Employee: ");
		String ad=sc.nextLine();
		System.out.print("Enter ID No. of the Employee: ");
		int id=sc.nextInt();
		Employee emp=new Employee(nm,ad,id);
		System.out.println("Details of the Employee: ");
		emp.display();
	}
}
