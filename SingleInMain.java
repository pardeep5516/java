//Single Inheritance
class Publisher
{
	int pubId;
	String pubName;
	void setData()
	{
		pubId = 123;
		pubName = "arya"; 
	}
	void putData()
	{
		System.out.println("pub id = "  + pubId + " pub name = " + pubName);	
	}
}
class Book extends  Publisher
{
	int bookId;
	double price;
	String bookName;
	void setBData()
	{
		bookId = 2;
		price = 466;
		bookName = "Java";
	}
	void putBData()
	{
		 System.out.println("book id = " + bookId + " book Name = " + bookName + 
		" book price = " + price);
	}
}
class SingleInMain
{
	public static void main(String args[])
	{
		Book  ob1 = new Book();
		ob1.setData();
		ob1.putData();
		ob1.setBData();
		ob1.putBData();	
	}
}
/*
$ java SingleInMain
pub id = 123 pub name = arya
book id = 2 book Name = Java book price = 466.0

*/