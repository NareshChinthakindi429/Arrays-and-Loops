package Loops;
import java.util.Scanner;
public class NoOrder 
{
	public static void main(String []args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. Any No. for Print Natrual No.");
		int x=s.nextInt();
		int i=1;
		while(i<=x)
		{
			System.out.print(i+" ");
			i++;
			
		}
	}
}
