package Threads;

import java.util.*;

public class process1 extends Thread {
	public String word;
	public static String vowels="aeiou";
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word : ");
		word=sc.next();
		int count=0;
		for(char item1: vowels.toCharArray())
			for(char item2: word.toCharArray())
				if(item1==item2)
					count++;
		System.out.println("Number of vowels is : "+count);
	}
}