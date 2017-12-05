import java.util.Scanner;
public class blockif 
{
	public static void main(String[]args)
	{
		int studentgrade;
		Scanner input= new Scanner (System.in);
		
		System.out.println("Enter Student Grade:");
		studentgrade= input.nextInt();
		
		if (studentgrade>=60)
		
			System.out.println("Passed");
		else
		{
			System.out.println("Failed");
			System.out.println("You must take this Course again");
		}
		
	}
}
