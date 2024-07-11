package Loops;
import java.util.Scanner;
public class countNumber {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
	    int n = s.nextInt();  
	   int r,count = 0;
	   
	   while(n!=0)
	   {
		    r = n%10;
		    count++;
		    n =  n/10;
	   }
	   System.out.println(count+" is count of digit ");
	 
	}
}
