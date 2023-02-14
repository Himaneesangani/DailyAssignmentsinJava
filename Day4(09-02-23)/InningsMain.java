import java.util.Scanner;

public class InningsMain {
	public static void main(String[] args)
	{
		Innings i1= new Innings();
		String temp;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Team Name :");
		i1.setTeamName(scan.next());
		System.out.println("Enter the Session :");
		temp=scan.next();
		if(temp.equals("First") || temp.equals("Second"))
		{
		i1.setInningsName(temp);
		System.out.println("Enter the Runs :");
		i1.setRuns(scan.nextInt());
		
		System.out.println("\nDetails : ");
		i1.displayInningsDetails();
		}
		else
		{
			System.out.println("\nEnter the vaild Session Name...");
		}
	}
}
