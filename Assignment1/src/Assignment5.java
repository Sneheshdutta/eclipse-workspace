import java.util.*;
class Customer
{
	String name,address;
	void setName(String name)
	{
		this.name=name;
	}
	void setAddress(String address)
	{
		this.address=address;
	}
}
class Account
{
	String ac_type,ac_no;
	void setAcType(String ac_type)
	{
		this.ac_type=ac_type;
	}
	void serAcNo(String ac_no)
	{
		this.ac_no=ac_no;
	}
}
class RBI
{   double i,w;
	Scanner sc=new Scanner(System.in);
	double getInterestRate()
	{
        System.out.println("Enter the Interest Rate : ");
        i=sc.nextDouble();
        if(i>=4)
        	return i;
        else
        	{System.out.println("Useless Interest Rate");
              return 0;}
	}
	double getWithDrawlLimit()
	{
        System.out.println("Enter the withdrawl Limit : ");
        w=sc.nextDouble();
        if(w<=40000)    //Assumed maximum withdrawl limit 40000
        	return w;
        else
        	{System.out.println("Useless withdrawl Limit");
              return 0;}
	}
}
class SBI extends RBI
{   
	double getInterestRate()
	{
		return(super.getInterestRate());
	}
	double getWithDrawlLimit()
	{
		return(super.getWithDrawlLimit());
	}
}
class ICICI extends RBI
{
	double getInterestRate()
	{
		return(super.getInterestRate());
	}
	double getWithDrawlLimit()
	{
		return(super.getWithDrawlLimit());
	}
}
class Assignment5
{
	public static void main(String args[])
	{
		SBI s1=new SBI();
		s1.getInterestRate();
		s1.getWithDrawlLimit();
	} 
}