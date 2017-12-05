import java.util.Scanner;
public class ifelsedouble 
{
	public static void main (String[]args)
	{
	int StudentGrade;
	Scanner input= new Scanner (System.in);
	System.out.print("Enter Student Grade:");
	StudentGrade= input.nextInt();
	if(StudentGrade>=60)
		System.out.print("Student is Pass");
	else
		System.out.print("Student Fail");
	}
}
