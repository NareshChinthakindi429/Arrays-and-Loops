package Loops;
import java.util.Scanner;
public class cubeOfNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number for Cube");
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i*i*i);
			i++;
		}

	}

}
