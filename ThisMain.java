class thisEx
{
	int a, b;
	void set(int p, int q)
	{
		this.a = p;
		this.b = q;
	}
	void display()
	{
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}	
}
class ThisMain
{
	public static void main(String args[])
	{
		thisEx ob1 = new thisEx();
		ob1.set(4, 5);
		ob1.display(); 
	}
}
/*
 java ThisMain
a = 4
b = 5

*/