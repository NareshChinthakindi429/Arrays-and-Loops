package Loops;
import java.util.Scanner;
public class Table 
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. For Table");
		int n=s.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.print(n*i+" ");

			i++;
			
		}
			}
}
