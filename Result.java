import java.util.*;
class result
  {
      public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        	String name,std,grade=null;
        	int sub1,sub2,sub3,total;
         	double percentage=0;
        	System.out.println("Enter name,std,sub1 marks,sub2 marks,sub3 marks");
        	name=sc.nextLine();
        	std=sc.nextLine();
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		total=sub1+sub2+sub3;
                if(sub1>=40 && sub2>=0 && sub3>=40)
 		{
			percentage=total/3;
			if(percentage>=75)
			{
				grade="Distinction";
			}
			else if(percentage>=60)
			{
				grade="FirstClass";
			}
			else if(percentage>=50)
			{
				grade="SecondClass";
			}
			else if(percentage>=40)
			{
				grade="Pass";
			}
			else
			{
				grade="Fail";
			}
		}
		else grade="---";
			System.out.println("Name :"+name);
			System.out.println("Standard :"+std);
			System.out.println("Subject 1 :"+sub1); 
			System.out.println("Subject 2 :"+sub2);
			System.out.println("Subject 3 :"+sub3);
			System.out.println("Total Marks out of 300 :"+total);
			System.out.println("Percentage :"+percentage);
			System.out.println("Garde :"+grade);
	}
  }				