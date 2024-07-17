
public class Strings {

	public static void main(String[] args) 
	{
		
		
		//	Remove Duplicate words in the given String
//		
//		String str="he is optinal however he is is exceptional";
//		String str1[]=str.split(" ");
//		for(int i=0;i<str1.length;i++)
//		{
//			for(int j=i+1;j<str1.length;j++)
//			{
//				if(str1[i].equals(str1[j]))
//				{
//					str1[i]="";
//				}
//			}
//		}
//		for(String x:str1)
//			{
//				if(x!="")
//				{
//					System.out.print(x+" ");
//				}
//			}
		
		
			//	*********	Count the Occurrence of Each  words in the given String *********
		
//			String str="he is optinal however he is is exceptional";
//			String str1[]=str.split(" ");
//			int cnt,p=0;
//			for(int i=0;i<str1.length;i++)
//			{
//				cnt=0;
//				for(int j=0;j<str1.length;j++)
//				{
//					if(str1[i].equals(str1[j]))
//					{
//						cnt++;
//						//p=1;	
//					}
//				}
//				System.out.println(str1[i]+" : "+cnt);
//				
//			}
		
		// ******** Count digits,alphabet and Special characters ********
//		String str="Rahul@123/$#";
//		char ch[]=str.toCharArray();
//		int dcnt=0,acnt=0,scnt=0;
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')
//			{
//				acnt++;
//			}
//			else if(ch[i]>='0' && ch[i]<='9')
//			{
//				dcnt++;
//			}
//			else
//			{
//				scnt++;
//			}
//		}
//		System.out.println("Alphabet Count is : "+acnt);
//		System.out.println("Digit Count is : "+dcnt);
//		System.out.println("Special Count is : "+scnt);
		
		//  ******** Remove Duplicate words ******** 
//		String str="He is optional however he is exceptional";
//		String str1[]=str.split(" ");
//		
//		for(int i=0;i<str1.length;i++)
//		{
//			for(int j=i+1;j<str1.length;j++)
//			{
//				if(str1[i].equalsIgnoreCase(str1[j]))
//				{
//					str1[i]=" ";
//				}
//			}
//		}
//		for(String x:str1)
//		{
//			if(x!=" ")
//			{
//				System.out.println(x);
//			}
//		}
		
		// ******** Longest Palindrome ********
		
//		String str="madam arora teaches malayalam";
//		String str1[]=str.split(" ");
//		
//		//String s2[]=new String[str.length()];
//		
//		String max="";
//		
//		for(int i=0;i<str1.length;i++)
//		{
//			
//			String s1=str1[i];
//			String rev="";
//			for(int j=s1.length()-1;j>=0;j--)
//			{
//				rev=rev+s1.charAt(j);
//			}
//			if(s1.equals(rev))
//			{
//				if(s1.length()>max.length())
//				{
//					max=s1;	
//				}
//			}
//		}
//		System.out.println(max);
		
		
		// ******** Replace with a to @ ********
		
//		String str="sathyaTech";
//		char ch[]=str.toCharArray();
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]=='a')
//			{
//				ch[i]='@';
//			}
//		}
//		for(char x:ch)
//		{
//			System.out.print(x);
//		}
		
		// ******** Reverse Of Each Word digits *******
		
//		String str="Hello World";
//		String str1[]=str.split(" ");
//		
//		String rev="";
//		for(int i=0;i<str1.length;i++)
//		{
//			String s1=str1[i];
//			
//			for(int j=s1.length()-1;j>=0;j--)
//			{
//				rev=rev+s1.charAt(j);
//			}
//			rev=rev+" ";
//		}
//		
//		System.out.println(rev);
		
		
		// Sum Of numbers in String
		
//		String str="rahul50kumar40k";  // O/P :- 90
//		char ch[]=str.toCharArray();
//		
//		String str1="";
//		int sum=0;
//		for(int i=0;i<ch.length;i++)
//		{
//			
//			if(ch[i]>='0' && ch[i]<='9')
//			{
//				str1=str1+ch[i];
//			}
//			else
//			{
//				if(str1!="")
//				{
//					sum=sum+(Integer.parseInt(str1));
//					str1="";
//				}
//			}
//			
//			//sum=sum+Integer.parseInt(str1);
//			//System.out.print(str1);
//		}
//		
//		System.out.println(sum);
		
		// ******** Find the second Repeated character in string ********
		
//		String str="abaabbbbcadab";
//		char ch[]=str.toCharArray();
//		int max=0,smax=0;
//		char c=0;
//		for(int i=0;i<ch.length;i++)
//		{
//			int cnt=0;
//			for(int j=0;j<ch.length;j++)
//			{
//				if(ch[i]==ch[j])
//				{
//					cnt++;
//				}
//			}
//			if(cnt>max)
//			{
//				//smax=max;
//				max=cnt;
//			}
//			else if(cnt>smax && cnt<max)
//			{
//				smax=cnt;
//				c=ch[i];
//			}	
//		}
//		System.out.println(c+" : "+smax);
		


	}

}
