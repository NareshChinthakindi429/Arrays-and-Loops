package Loops;
import java.util.Scanner;
public class armStrongNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number for ArmStrong or not");
		int n=s.nextInt();
		int x=n,y=n,cnt=0,sum=0;
		while(n!=0)
		{
			cnt++;
			n=n/10;
		}
		while(x!=0)
		{
			int r=x%10;
			
			int m=1;
			for(int i=1;i<=cnt;i++)
			{
				m=m*r;
			}
			sum=sum+m;
			x=x/10;
			
		}
		if(sum==y)
		{
			System.out.println(y+" is ArmStrong");
		}
		else
		{
			System.out.println(y+" is Not ArmStrong");
		}
		

	}

}
