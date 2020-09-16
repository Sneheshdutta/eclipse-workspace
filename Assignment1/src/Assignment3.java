import java.util.*;
class Programming
{   String lan;
	Programming()
	{
		System.out.println("I love Programming Languages");
	}
	Programming(String l)
	{
		System.out.println("I love "+l);
	}

}
class Assignment3
{
	public static void main(String args[])
	{
		String l;
		Programming p1=new Programming();
		System.out.println("Enter the Language name : ");
        Scanner sc=new Scanner(System.in);
		l=sc.nextLine();
		Programming p2=new Programming(l);
	}
}