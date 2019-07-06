import java.util.*;
public class Login
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String uname, pass;
		System.out.println("Enter username and Password : ");
		uname = sc.nextLine();
		pass = sc.nextLine();
		if((uname.equals("admin")) && (pass.equals("12345")))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}
}