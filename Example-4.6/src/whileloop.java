import java.util.Scanner;
public class whileloop 
{
	private String coursename; 
	
	public whileloop ( String name )
		{
		coursename=name;                     //constructor initialize course name
		}
	
	public void setcoursename ( String name )//method to set course name
		{
		coursename=name;                     //store course name
		}
	
	public String getcoursename ()           //method to get course name
		{
		return coursename;                   //return course name value
		}
	
	public void displaymessage()             //display welcome message to gradebook(whileloop)user
		{
		System.out.printf("Welcome to grade book for \n%s!\n\n", getcoursename());
		}
	
	
	public void determineClassaverage()             					
		{
		 
		Scanner input = new Scanner( System.in);    //create Scanner
		 int total;                                 //sum of grades enter by user
		 int grade;                                 //grade value enter by user
		 int gradecounter;                          //number of grade to be entered next
		 int average;                               //average of grades
		 
		 total=0;                                   //initialize total
		 gradecounter=1;                            //initialize loop counter 
		  
		 while ( gradecounter<=10 )                 //loop 10 time
		 	{
			 System.out.println("Enter grade:");	
			 grade=input.nextInt();					//input next grade
			 total=total+grade;						//add grade to total
			 gradecounter=gradecounter+1;			//increment counter or gradecounter++
		 	}
		 
		 average=total/10;
		 
		 System.out.printf("\nTotal of all grades is:%d\n", total);
		 System.out.printf("Class average is: %d\n", average);
		 
		}
	
	public static void main(String[]args)
	 	{
		whileloop mywhileloop= new whileloop("CSI-101 Introductio to java programmingN");
		mywhileloop.displaymessage();
		mywhileloop.determineClassaverage();
	 	}
}
