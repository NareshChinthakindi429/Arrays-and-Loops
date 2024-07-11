package Loops;
import java.util.Scanner;
public class matchAvg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int i=1,score=0,avg;
		while(i<=5)
		{
			
			System.out.println("Enter match " +i+ " socre");
		    int n=s.nextInt();
			score=score+n;
			i++;
		}
		avg=score/5;
		System.out.println(score+" is Total Score");
		System.out.println(avg+" is Avarage");

	}

}
