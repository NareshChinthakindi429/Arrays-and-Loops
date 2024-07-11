package Loops;
import java.util.Scanner;
public class arithmeticMenu 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a,b,ch;
		char c;
		boolean bln=false;
		do
		{
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
			System.out.println("Enter Your Choice");
			ch=s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("You Entered Addition");
				System.out.println("Enter a 1st Number");
				a=s.nextInt();
				System.out.println("Enter 2nd Number");
				b=s.nextInt();
				System.out.println("Result is "+(a+b));
				break;
				
			case 2:
				System.out.println("You Entered Subtraction");
				System.out.println("Enter a 1st Number");
				a=s.nextInt();
				System.out.println("Enter 2nd Number");
				b=s.nextInt();
				System.out.println("Result is "+(a-b));
				break;
				
			case 3:
				System.out.println("You Entered Multiplication");
				System.out.println("Enter a 1st Number");
				a=s.nextInt();
				System.out.println("Enter 2nd Number");
				b=s.nextInt();
				System.out.println("Result is "+(a*b));
				break;
				
			case 4:
				System.out.println("You Entered Division");
				System.out.println("Enter a 1st Number");
				a=s.nextInt();
				System.out.println("Enter 2nd Number");
				b=s.nextInt();
				System.out.println("Result is "+(a/b));
				break;
				
			case 5:
				System.out.println("You Entered Modulus");
				System.out.println("Enter a 1st Number");
				a=s.nextInt();
				System.out.println("Enter 2nd Number");
				b=s.nextInt();
				System.out.println("Result is "+(a%b));
				break;
				
			case 6:
				System.out.println("You Entered Exit! Thank you...");
				System.exit(0);
				
			default:
				System.out.println("Invalid Input! Please Enter Valid Input");
				break;
			}
		
		System.out.println("Do you want continue Yes(Y)/No(N)");
		c=s.next().charAt(0);
		
		if(c=='Y' || c=='y')
		{
			bln=true;
		}
		else
		{
			bln=false;
			System.out.println("Thanks for Using....");
		}
		
	}while(bln);
  }
}
