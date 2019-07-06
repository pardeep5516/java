import java.util.*;
public class Result 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name, std, grade = null;
		int m1, m2, m3, total;
		double percent = 0.0;
		System.out.println("Enter :name, std, subject 1 marks, subject 2 marks, subject 3 marks");
		name = sc.nextLine();
		std = sc.nextLine();
		m1 = sc.nextInt();
		m2 = sc.nextInt();		
		m3 = sc.nextInt();
		total = m1 + m2 + m3;
		if(m1 >= 45 && m2 >= 45 && m3 >=45)
		{
			System.out.println("You are pass");
			percent = total / 3;
			if(percent >= 75)
			{
				grade = "A Grade";
			}
			else if (percent >= 65)
			{
				grade = "B Grade";
			}
			else if(percent >= 55)
			{
				grade = "C Grade";
			}
			else if(percent >= 45)
			{
				grade = "D Grade";
			}
			else
			{
				grade = "Fail";
			}
		}
		else
		{
			System.out.println("you are Fail");
		}
			System.out.println("Name : " + name);
			System.out.println("Std : " + std);
			System.out.println("Total : " + total);
			System.out.println("Percent : " + percent);
			System.out.println("Grade :" + grade);
	}
}