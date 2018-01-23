package add;

import java.util.Scanner;
public class Calculator {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter x or + for to calculate");
		String y = scan.nextLine();
		int sum = 0;
		int sum1 = 1;
		if(y.equals("x"))
		{
			System.out.println("You chose multiplication, pleas enter a number");
			while(scan.hasNextInt())
			{
				int a = scan.nextInt();
				sum1 = sum1* a;
				System.out.println("Please enter another number or q to print the sum");
			}
		}
		else
		{
			System.out.println("You chose addition, please enter a number");
			while(scan.hasNextInt())
			{
				int a = scan.nextInt();
				sum = sum + a;
				System.out.println("Please enter another number or q to print the sum");
			}
		}
		
		if(y.equals("x"))
		{
			System.out.println(sum1);
			

		}
		else
		{
			System.out.println(sum);
		}
		
			
	}

}
