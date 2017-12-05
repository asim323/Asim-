import java.util.Scanner;
public class nestedifelse 
{
	public static void main(String[]args)
	{
	int StudentGrade;	
	Scanner input= new Scanner(System.in);
	
	System.out.print("Enter Student Grade:");
	StudentGrade=input.nextInt();
	
	if(StudentGrade>=90)
		System.out.print("A");
		else
			if(StudentGrade>=80)
				System.out.print("B");
				else
					if(StudentGrade>=70)
						System.out.print("C");
					else
						if(StudentGrade>=60)
							System.out.print("D");
						else
							System.out.print("F");
	
	
	
	}
}
