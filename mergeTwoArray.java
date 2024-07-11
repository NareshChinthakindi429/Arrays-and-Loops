package Arrays;
import java.util.Scanner;
public class mergeTwoArray 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int n=s.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[a.length+b.length];
		
		System.out.println("Enter 1st Array Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter 2nd Array Elments");
		for(int j=0;j<b.length;j++)
		{
			b[j]=s.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			c[a.length+j]=b[j];
		}
		System.out.println("Merge Array is");
		for(int x:c)
		{
			System.out.print(x+" ");
		}
		
	}

}
