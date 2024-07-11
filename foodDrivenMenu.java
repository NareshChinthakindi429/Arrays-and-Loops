package Loops;
import java.util.Scanner;
public class foodDrivenMenu
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int choice1,choice2,ch,p,amount;
		boolean b=false;
		do
		{
			System.out.println("Food Menu in the Below:-\n1.Breakfast\n2.Lunch\n3.Dinner\n4.Fast Food\n5.Exit\n");
			System.out.println("Enter Your Choice :-");
			choice1=s.nextInt();
			switch(choice1)
			{
			case 1:
				System.out.println("BreakFast items List");
				do
				{
					System.out.println("1.Puri\n2.Dosa\n3.Wada\n4.Bonda\n5.Exit\n");
					System.out.println("Enter Your Choice :-");
					choice2=s.nextInt();
					switch(choice2)
					{
					case 1:
						System.out.println("Enter No. of Plates of Puri(30 rs/per)");
						p=s.nextInt();
						amount=30*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 2:
						System.out.println("Enter No. of Plates of Dosa(40 rs/per)");
						p=s.nextInt();
						amount=40*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 3:
						System.out.println("Enter No. of Plates of Wada(25 rs/per)");
						p=s.nextInt();
						amount=25*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 4:
						System.out.println("Enter No. of Plates of Bonda(20 rs/per)");
						p=s.nextInt();
						amount=20*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 5:
						System.out.println("You Entered Exit!");
						System.exit(0);
					default:
						System.out.println("Invaild Option");
						break;
					}
					System.out.println("\nDo you want Order Any BreakFast Items Yes/No");
					ch=s.next().charAt(0);
					
					if(ch=='Y' || ch=='y')
					{
						b=true;
					}
					else
					{
						b=false;
						System.out.println("Thanks for Buying BreakFast Items");
					}
					
				}while(b);
				break;
			
			case 2:
				System.out.println("Lunch items List");
				do
				{
					System.out.println("1.Fried Rice\n2.Rice+Chiken\n3.Biryani\n4.Roti+Sabji\n5.Exit\n");
					System.out.println("Enter Your Choice :-");
					choice2=s.nextInt();
					switch(choice2)
					{
					case 1:
						System.out.println("Enter No. of Plates of Fried Rice(80 rs/per)");
						p=s.nextInt();
						amount=80*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 2:
						System.out.println("Enter No. of Plates of Rice+Chiken(120 rs/per)");
						p=s.nextInt();
						amount=120*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 3:
						System.out.println("Enter No. of Plates of Biryani(100 rs/per)");
						p=s.nextInt();
						amount=100*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 4:
						System.out.println("Enter No. of Plates of Roti+Sabji(60 rs/per)");
						p=s.nextInt();
						amount=60*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 5:
						System.out.println("You Entered Exit!");
						System.exit(0);
					default:
						System.out.println("Invaild Option");
						break;
					}
					System.out.println("\nDo you want Order Any Lunch Items Yes/No");
					ch=s.next().charAt(0);
					
					if(ch=='Y' || ch=='y')
					{
						b=true;
					}
					else
					{
						b=false;
						System.out.println("Thanks for Buying Lunch Items");
					}
					
				}while(b);
				break;
				
			case 3:
				System.out.println("Dinner items List");
				do
				{
					System.out.println("1.Roti+Allo Buji\n2.Veg Fried Rice\n3.Rice+Egg Curi\n4.Rice+Mutton\n5.Exit\n");
					System.out.println("Enter Your Choice :-");
					choice2=s.nextInt();
					switch(choice2)
					{
					case 1:
						System.out.println("Enter No. of Plates of Fried Roti+Allo Buji(70 rs/per)");
						p=s.nextInt();
						amount=70*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 2:
						System.out.println("Enter No. of Plates of Veg Fried Rice(90 rs/per)");
						p=s.nextInt();
						amount=90*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 3:
						System.out.println("Enter No. of Plates of Rice+Egg Curi(95 rs/per)");
						p=s.nextInt();
						amount=95*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 4:
						System.out.println("Enter No. of Plates of Rice+Mutton(150 rs/per)");
						p=s.nextInt();
						amount=150*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 5:
						System.out.println("You Entered Exit!");
						System.exit(0);
					default:
						System.out.println("Invaild Option");
						break;
					}
					System.out.println("\nDo you want Order Any Dinner Items Yes/No");
					ch=s.next().charAt(0);
					
					if(ch=='Y' || ch=='y')
					{
						b=true;
					}
					else
					{
						b=false;
						System.out.println("Thanks for Buying Dinner Items");
					}
					
				}while(b);
				break;
				
			case 4:
				System.out.println("Fast Food Fast items List");
				do
				{
					System.out.println("1.Momos\n2.Pani Puri\n3.Egg Role\n4.Manchurian\n5.Burger\n6.Exit\n");
					System.out.println("Enter Your Choice :-");
					choice2=s.nextInt();
					switch(choice2)
					{
					case 1:
						System.out.println("Enter No. of Plates of Momos(50 rs/per)");
						p=s.nextInt();
						amount=50*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 2:
						System.out.println("Enter No. of Plates of Pani Puri(20 rs/per)");
						p=s.nextInt();
						amount=20*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 3:
						System.out.println("Enter No. of Plates of Egg Role(40 rs/per)");
						p=s.nextInt();
						amount=40*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 4:
						System.out.println("Enter No. of Plates of Manchurian(70 rs/per)");
						p=s.nextInt();
						amount=70*p;
						System.out.println("Your Amount is :"+amount);
						break;
					case 5:
						System.out.println("Enter No. of Plates of Burger(35 rs/per)");
						p=s.nextInt();
						amount=35*p;
						System.out.println("Your Amount is :"+amount);
						break;	
					case 6:
						System.out.println("You Entered Exit!");
						System.exit(0);
					default:
						System.out.println("Invaild Option");
						break;
					}
					System.out.println("\nDo you want Order Any Fast Food Items Yes/No");
					ch=s.next().charAt(0);
					
					if(ch=='Y' || ch=='y')
					{
						b=true;
					}
					else
					{
						b=false;
						System.out.println("Thanks for Buying Fast Food Items");
					}
					
				}while(b);
				break;
			case 5:
				System.out.println("You Entered exit");
				System.exit(0);
			}

			System.out.println("\nDo you want Any Food Items Yes/No");
			ch=s.next().charAt(0);
			
			if(ch=='Y' || ch=='y')
			{
				b=true;
			}
			else
			{
				b=false;
				System.out.println("Thanks for Using....");
			}			
		}while(b);			
	}
}
