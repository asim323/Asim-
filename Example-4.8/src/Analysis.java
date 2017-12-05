import java.util.Scanner;
public class Analysis //nested control statement
	{
	public static void main(String[]args)
		{
		Scanner input= new Scanner(System.in);
		int passes=0;
		int failures=0;
		int studentcounter=1;
		int result;
		
		while(studentcounter<=10)
			{
			System.out.print("Enter result (1=pass,2=failures)");
			result=input.nextInt();
			
			if(result==1)
				passes= passes + 1;
			else
				failures= failures + 1;
			
			studentcounter= studentcounter + 1;
			}
		
		System.out.printf("passed:%d\nfailed:%d",passes,failures);
		if(passes>8)
			System.out.println("\nBonus To Instructor");
		
		}
	}	
