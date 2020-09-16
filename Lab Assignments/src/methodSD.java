import java.util.*;
class Student{
        private String name,add;
	private int age;
	Student(){
		name="Unknown";
		age=0;
		add="not avaliable";
		}


        void setInfo(String a,int b){
		name=a;
		age=b;
                System.out.println("Name of Student: "+name+"  Age of student: "+age+" Address of student:"+add);
                }
	void setInfo(String a,int b,String c){
		name=a;
		age=b;
		add=c;
                System.out.println("Name of Student:"+name+" Age of student:"+age+" Address of Student:"+add);
                }
}

class methodSD
{
public static void main(String args[]){
System.out.println("Enter details of Student 1 :");
Scanner sc=new Scanner(System.in);
String a1=sc.nextLine();
int b1=sc.nextInt();
Student  std1=new Student();
std1.setInfo(a1,b1);
System.out.println("Enter details of Student 2 :");
String a2=sc.nextLine();
String x=sc.nextLine();
int b2=sc.nextInt();
String y=sc.nextLine();
String c2=sc.nextLine();
Student  std2=new Student();
std2.setInfo(a2,b2,c2);

}}
