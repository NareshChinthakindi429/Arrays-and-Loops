package Loops;
import java.util.Scanner;
public class rangeNaturalNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter ranage-1");
		int i=s.nextInt();
		
		System.out.println("Enter ranage-2");
		int j=s.nextInt();
		
		while(i<=j)
		{
			System.out.println(i);
			i++;
		}

	}

}
