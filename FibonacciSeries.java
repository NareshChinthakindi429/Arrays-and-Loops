package Loops;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number for Fibonacci Series");
		int n=s.nextInt();
		
		int a=0,b=1,c,i=1;
		System.out.println(a+"\n"+b);
		while(i<=n)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;
		}
	}
}
