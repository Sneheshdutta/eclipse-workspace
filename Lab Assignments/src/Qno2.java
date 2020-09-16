import java.util.*;
class Lab2
{
	public static void main(String[] args) 
	{
		String num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		num=sc.next();
		System.out.println();
		System.out.println("Output of All Digits Odd: "+allDigitsOdd(num));
	}
	public static boolean allDigitsOdd(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			String temp=s.substring(i,i+1);
			if(Integer.parseInt(temp)%2==0)
				return false;
		}
		return true;
	}

}