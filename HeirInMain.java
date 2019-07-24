class collage
{
	String name;
	void setData()
	{
		name = "Model Collage";
	}
	void putData()
	{
		System.out.println("Collage Name = " + name);
	}
}
class it extends collage
{
	double fees;
	String CourceDuration;
	void setITData()
	{
		fees = 24000;
		CourceDuration = "3 Years";
	}
	void putITData()
	{
		System.out.println("fees = " + fees + " CourceDuration = " + CourceDuration);
	}
}
class cs extends collage
{
	double fees;
	String CourceDuration;
	void setCSData()
	{
		fees = 32000;
		CourceDuration = "3 Years";
	}
	void putCSData()
	{
		System.out.println("fees = " + fees + " CourceDuration = " + CourceDuration);
	}
}
class HeirInMain
{
	public static void main(String args[])
	{
		it ITstud = new it();
		ITstud.setITData();
		ITstud.putITData();
		cs CSstud =  new cs();
		CSstud.setCSData();
		 CSstud.putCSData();
	}
}