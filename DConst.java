//default constructor
class DConst
{
	int a, b;
	public DConst()
	{
		System.out.println("Inside default constructor ");
		a = 15;
		b = 10;
	}
	public void display()
	{
		System.out.println("a= " + a +" and b = " + b);
	}
	public static void main(String args[])
	{
		DConst c1 = new DConst();
		DConst c2 = new DConst();
		c1.display();
		c2.display();
	}
/*
java DConst
Inside default constructor
Inside default constructor
a= 15and b = 10
a= 15and b = 10
*/
}