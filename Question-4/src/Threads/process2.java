package Threads;

import java.util.*;

public class process2 extends Thread {
	public static String digits[]= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	public String number;
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number with more than 4 digits:");
		number=sc.next();
		for(char ch: number.toCharArray() )
		{   
			int i=(int)ch-48;
			System.out.print("  "+digits[i]);
		}
	}
}