class staticEx1
{
	static int a;
	static int count;
	public static void show()
	{
		System.out.println("Static data member a= " + a);
		System.out.println("Static data member count= " + count);
	}
	public static void main(String args[])
	{
		System.out.println("Calling static member function ");
		staticEx1.show();
		System.out.println("value of static data member: "  + staticEx1.a);
		System.out.println("value of static data member: "  + staticEx1.count);
	}
/*
$ java staticEx1
Calling static member function
Static data member a= 0
Static data member count= 0
value of static data member: 0
value of static data member: 0
*/
}