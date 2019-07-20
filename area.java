class area
{
	int l, b, side;
	int ar;
	area(int p, int q)
	{
		l = p;
		b = q;
	}
	area(int x)
	{
		side = x;	
	}
	void calRect()
	{
		ar = l * b;
	}
	void printRectArea()
	{
		System.out.println("area of rectangel : " + ar);
	}
	void calSq()
	{
		ar = side * side;
	}
	void printSqArea()
	{
		System.out.println("Area of square : " + ar);
	}
	public static void main(String args[])
	{
		area ob1 = new area(5, 6);
		ob1.calRect();
		ob1.printRectArea();

		area ob2 = new area(10);
		ob2.calSq();
		ob2.printSqArea();
	}
/*
$ java area
area of rectangel : 30
Area of square : 100

*/
}