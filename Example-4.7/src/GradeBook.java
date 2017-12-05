import java.util.Scanner;
public class GradeBook 								//sentinel controlled repitition
	{
private String coursename; 
	
	public GradeBook ( String name )
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
		 double average = 0 ;                            //average of grades
		 
		 total=0;                                   //initialize total
		 gradecounter=0;                            //initialize loop counter 
		 
		 System.out.println("Enter Grade or -1 to quit");
		 grade=input.nextInt();
		 while ( grade!=-1 )                 //infinite loop untill user enter -1
		 	{
			 total=total+grade;						//add grade to total
			 gradecounter=gradecounter+1;			//increment counter or gradecounter++
			 System.out.println("Enter Grade or -1 to quit");
			 grade=input.nextInt();
		 	}
		 
		 if (gradecounter !=0)
			 average=(double)total/gradecounter;
		 
		 System.out.printf("\nTotal of the %d Grades entered is %d\n",gradecounter, total);
		 System.out.printf("Class average is: %.2f\n", average);
		 
		}
	
	public static void main(String[]args)
	 	{
		GradeBook myGradeBook= new GradeBook("CSI-101 Introductio to java programmingN");
		myGradeBook.displaymessage();
		myGradeBook.determineClassaverage();
	 	}
	}
