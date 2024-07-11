package Loops;
import java.util.Scanner;
public class FactorOfNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number for Factor");
		int n=s.nextInt();
		System.out.println("factors of " +n+" are:-");
		
		int i=1;
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
