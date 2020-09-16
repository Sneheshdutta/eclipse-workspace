import java.util.*;

class College{
	String clg_name;
	String address;
	College(String clg_name,String address)
	{
		this.clg_name = clg_name;
		this.address = address;
	}
	public void showCollegeDetails()
	{
		System.out.println("Name: "+clg_name+"\n"+"Address: "+address);
	}
}

class Department extends College
{
	String dept;
	String hod;
	Department(String clg_name,String address,String dept,String hod)
	{
		super(clg_name,address);
		this.dept = dept;
		this.hod= hod;
	}
	public void showDepartmentDetails()
        {
        		super.showCollegeDetails();
        		System.out.println("Department Name: "+dept+"\n"+"HOD: "+hod);
                
        }
}
class FacultyMember extends Department
{
	String faculty_name;
	String faculty_qualification;
	int no_years;
	
	FacultyMember(String clg_name,String address,String dept,String hod,String faculty_name,String faculty_qualification,int no_years)
	{
		super(clg_name,address,dept,hod);
		this.faculty_name = faculty_name;
		this.faculty_qualification=faculty_qualification;
		this.no_years=no_years;
	}
	public void showFacultyMembersDetails()
        {
        		super.showDepartmentDetails();
        		System.out.println("Faculty Name: "+faculty_name+"\n"+"Faculty Qualification: "+faculty_qualification+"\n"+"No. of years Workd: "+no_years);
                
        }
}

class Lab1{
	public static void main(String[] args) {
		System.out.println("Only College Details");
		College clg=new College("BPPIMT","Kaikhali");
		clg.showCollegeDetails();
		System.out.println("\nCollege  & Department Details");
		Department dpt=new Department("BPPIMT","Kaikhali","ECE","Ivy Majumder");
		dpt.showDepartmentDetails();
		System.out.println("\nCollege,Department,Faculty Details");
		FacultyMember fm=new FacultyMember("BPPIMT","Kaikhali","ECE","Ivy Majumder","Atul Das","Phd",15);
		fm.showFacultyMembersDetails();
	}
}