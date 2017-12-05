import java.util.Scanner;
public class danglingelse 
{
	public static void main (String[]args)
	{
		int x,y;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter The Value Of X:");
		x= input.nextInt();
		
		System.out.println("Enter The Value Of Y:");
		y= input.nextInt();
		
		if(x>5)
		
		{
		if(y>5)
			System.out.println("X and Y are Greater Than 5");
		}
		else
			System.out.println("X <= 5 ");
		
	}
}