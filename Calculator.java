import java.util.*;
public class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a, b, ans;
		char op;
		System.out.println("Enter 2 Number");
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("Enter an operator ( +, -, *, / )");
		op = sc.next().charAt(0);
		switch(op)
		{
			case '+':
				ans = a + b;
				System.out.println("addition : " + ans);
				break;
			case '-':
				ans = a - b;
				System.out.println("substraction : " + ans);
				break;
			case '*':
				ans = a * b;
				System.out.println("multiplication : " + ans);
				break;
			case '/':
				ans = a / b;
				System.out.println("division : " + ans);
				break;
			default:
				System.out.println("not valid operators");
		}
	}
}