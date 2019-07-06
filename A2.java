//array using user input
import java.util.*;
public class A2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m[] = new int[10];
		int i, max;
		System.out.println("Enter 10 Element : ");
		for(i = 0; i < 10; i++)
		{
			m[i] = sc.nextInt();
		}
		max = m[0];
		for(i = 1; i < 10 ; i++)
		{
			if(m[i] > max)
			{
				max = m[i];
			}
		}
		System.out.println("max of array element is : "  + max);
	}
}