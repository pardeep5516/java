//parameterised constructor
class PConst
{
	int a, b;
	public PConst(int x, int y)
	{
		System.out.println("Inside parameterised constructor ");
		a = x;
		b = y;
	}
	public void display()
	{
		System.out.println("a= " + a +" and b = " + b);
	}
	public static void main(String args[])
	{
		PConst c1 = new PConst(15, 62);
		PConst c2 = new PConst(100, 200);
		c1.display();
		c2.display();
	}
/*
$ java PConst
Inside parameterised constructor
Inside parameterised constructor
a= 15 and b = 62
a= 100 and b = 200

*/
}