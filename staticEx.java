class staticEx
{
	int a;
	static int count;
	staticEx()
	{
		a = 0;
		count = 0;
	}
	void getcount()
	{
		a = ++count; 
	}
	void printcount()
	{
		System.out.println("Value of a " + a);
		System.out.println("Counter value " + count);
	}
	public static void main(String args[])
	{
		staticEx ob1 = new staticEx();
		staticEx ob2 = new staticEx();
		staticEx ob3 = new staticEx();
		ob1.getcount();
		ob1.printcount();
		ob2.getcount();
		ob2.printcount();
		ob3.getcount();
		ob3.printcount();
	}
/* 
 java staticEx
Value of a 1
Counter value 1
Value of a 2
Counter value 2
Value of a 3
Counter value 3
*/
}