import java.util.Scanner;
public class ifsingle 
{
	public static void main (String[]args) 
	{
	int StudentGrade;
	Scanner input= new Scanner( System.in );
	
	 	System.out.print("Enter Student Grade:");
		StudentGrade = input.nextInt();
		if (StudentGrade>=60)
		{
			System.out.print("Student Pass");
			
		}
			
	

	}
}
