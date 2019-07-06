//array using asignment statement
public class A1
{
	public static void main(String[] args)
	{
		int i, sum = 0;
		int m1[] = {10, 20, 30, 40, 50};
		for(i = 0; i < 5; i++)
		{
			sum = sum + m1[i];
		}
		System.out.println("Sum of all element is : "  + sum);
	}
}