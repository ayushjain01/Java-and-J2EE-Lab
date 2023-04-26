package BookCollection;

class Book
{
	String title,author, publisher;
	double price;
	Book(String title,String author,String publisher,double price)
	{ 
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price = price;
	}
	
	public String toString()
	{
		String str= "Book Title : "+this.title+ "\n"
				+ "Author : "+this.author + "\n"
				+ "Publisher : " + this.publisher + "\n"
				+ "Price : " + this.price;
		return str;
	}
}
