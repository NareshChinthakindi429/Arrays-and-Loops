package Loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no. For Factorial");
		int n=s.nextInt();
		int i=1;
		int fact=1;
		while(i <= n)
		{
			
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}
