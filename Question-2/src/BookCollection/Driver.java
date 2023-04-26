package BookCollection;

import java.util.*;

public class Driver {
	static Scanner sc = new Scanner(System.in);
	static int i = 1;
	
	static void printBooks(HashMap<Integer,Book> booksHM)
	{
		for(Map.Entry<Integer,Book> entry : booksHM.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().toString());
		}
	}
	
	static void addBook(ArrayList<Book> booksArr,HashMap<Integer,Book> booksHM)
	{
		System.out.println("Enter Book Details");
		System.out.println("Enter Title");
		String title =sc.nextLine();
		System.out.println("Enter Author");
		String author = sc.nextLine();
		System.out.println("Enter Publisher");
		String pub = sc.nextLine();
		System.out.println("Enter Price");
		double price = Double.parseDouble(sc.nextLine());
		Book b1 = new Book(title,author,pub,price);
		//store it in a Collection List
		booksArr.add(b1);
		
		//Maintain the book details with respect to an unique book id.
		booksHM.put(i++,b1);
	}
	
	public static void main(String args[]){
		ArrayList<Book> booksArr = new ArrayList<Book>();
		HashMap<Integer,Book> booksHM = new HashMap<Integer,Book>();
		int ch = 1;
		while(ch == 1)
		{
			addBook(booksArr,booksHM);
			System.out.println("Enter 1 to continue : )");
			ch = sc.nextInt();
			sc.nextLine();
		}
		
	//Write a method to sort the books in ascending order of price and store it in another List.
	ArrayList clone = new ArrayList();
	ArrayList<Book> bookist = (ArrayList)booksArr.clone();
	
	bookist.sort(new BookCompare());
	System.out.println("Before Sorting - ");
	System.out.println(booksArr);
	System.out.println("After Sorting - ");
	System.out.println(bookist);

	//Prompt for an author name and list all the books with the same author’s name.
	System.out.println("Enter author's name : ");
	String authorName = sc.nextLine();
	for(Map.Entry<Integer,Book> entry : booksHM.entrySet())
	{ 
		if(entry.getValue().author.equals(authorName))
		{
			System.out.println(entry.getValue().toString());
		}
	}
	
	//Create a new list holding all the book details with price greater than a user specified price.
	
	LinkedList<Book> lBook = new LinkedList<Book>();
	System.out.println("Enter base price : ");
	double base = Double.parseDouble(sc.nextLine());
	for(Map.Entry<Integer,Book> entry : booksHM.entrySet())
	{ 
		if(entry.getValue().price>base)
		{
			lBook.add(entry.getValue());
		}
	}
	
	System.out.println("Books with price > than base price "+base);
	for(Book b:lBook)
	{
		System.out.println(b.toString());
	}
	
	//For a given a value by the user, find all the books that match either the whole or a part of the book title.
	
	System.out.println("Enter a substring to search books : ");
	String value = sc.nextLine();
	for(Map.Entry<Integer,Book> entry : booksHM.entrySet())
	{ 
		if(entry.getValue().title.contains(value))
		{
			System.out.println(entry.toString());
		}
	}
	
	//Identify a publisher and print books from a particular publisher.
	System.out.println("Enter Publisher Name : ");
	String publisher = sc.nextLine();
	for(Map.Entry<Integer,Book> entry : booksHM.entrySet())
	{ 
		if(entry.getValue().publisher.equals(publisher))
		{
			System.out.println(entry.toString());
		}
	}
	
	//Update the publisher details based on a title.
	System.out.println("Enter title : ");
	String title = sc.nextLine();
	System.out.println("Enter updated publisher information : ");
	publisher = sc.nextLine();
	for(Map.Entry<Integer,Book> entry : booksHM.entrySet())
	{ 
		if(entry.getValue().title.equals(value))
		{	
			entry.getValue().publisher = publisher;
			System.out.println(entry.toString());
		}
	}
	printBooks(booksHM);
	}
}