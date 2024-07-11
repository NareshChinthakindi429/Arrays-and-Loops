package Loops;
import java.util.Scanner;
public class AddNaturalNo 
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No. For sum of Natrual No.");
		int x=s.nextInt();
		int i=1,sum=0;
		while(i<=x)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum is= "+sum);
		
	}
}
