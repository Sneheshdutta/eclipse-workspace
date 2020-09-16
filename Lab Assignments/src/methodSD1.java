import java.util.*;
class VolumeCal{
	private double l,w,h;
	void cal(double a){
		double y=6*a*a;
		double z=a*a*a;
		System.out.println("Volume of cube:"+z+"Surface area of cube:"+y);
		}
	void cal(double r,double h){
		double a=3.14*r*r*h;
		double b=2*3.14*r*h+2*3.14*r*r;
		System.out.println("Volume of cylinder:"+b+"Surface area of cube:"+a); 
                } 
	void cal(double a,double b,double c){
		double x=a*b*c;
		double y=2*(a*b+b*c+c*a);
		System.out.println("Volume of rectangle:"+x+"Surface area of rectangle:"+y); 
                } 
}

class methodSD1
{
public static void main(String args[]){
System.out.println("Enter length of cube:");
VolumeCal cube=new VolumeCal();
Scanner sc=new Scanner(System.in);
double a1=sc.nextDouble();
cube.cal(a1);
System.out.println("Enter radius and height of cylinder:");
VolumeCal cy=new VolumeCal();
double r=sc.nextDouble();
double h=sc.nextDouble();
cy.cal(r,h);
System.out.println("Enter length,width,height of rectangle:");
VolumeCal rec=new VolumeCal();
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
rec.cal(a,b,c);
}}
