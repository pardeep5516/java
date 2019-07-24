//multilevel Inheritance
class bank
{
	String bname, brloc, accno;
	double balance;
	void getBankDetails()
	{
		bname = "ABC";
		brloc = "PQR";
		accno = "1246675466";
	}
	void dbankDetails()
	{
		System.out.println("Bank name = " + bname + " brloc = " + brloc);
	}
}
class deposit extends bank
{
	double amt;
	void getdepamt()
	{
		amt = 500;
		balance = balance + amt;
	}
}
class withdrow extends deposit
{
	double wamt;
	void getwamt()
	{
		wamt = 200; 
		balance = balance - wamt;
	}
}
class balance extends withdrow
{
	void display()
	{
		System.out.println("Balance = " + balance);
	}
}
class MultiLevelInMain
{
	public static void main(String args[])
	{
		balance ob1 = new balance();
		ob1.getBankDetails();
		ob1.getdepamt();
		ob1.getwamt();
		ob1.dbankDetails();
		ob1.display();	
	}
}
/*
$ java MultiLevelInMain
Bank name = ABC brloc = PQR
Balance = 300.0

*/