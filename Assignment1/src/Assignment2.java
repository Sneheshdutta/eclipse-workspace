import java.util.*;
class Employee
{
	String name,dob;
	int salary;
	Employee(String name,int salary,String dob)
	{
		this.name=name;
		this.salary=salary;
		this.dob=dob;
	}
	void display()
	{
		System.out.println(name+"		"+salary+"		"+dob);
	}
}
class Assignment2
{
	public static void main(String args[])
	{   String name,dob;
	    int salary;
		Employee obj[]=new Employee[10];
		for(int i=0;i<2;i++)
		{   Scanner sc=new Scanner(System.in);
			System.out.print("Enter Name : ");
            name=sc.nextLine();
            System.out.print("Enter DOB : ");
            dob=sc.nextLine();
            System.out.print("Enter Salary : ");
            salary=sc.nextInt();
            obj[i]=new Employee(name,salary,dob);
		}
		System.out.println("Name		salary		DOB");
		for(int i=0;i<2;i++)
			obj[i].display();
	}
}