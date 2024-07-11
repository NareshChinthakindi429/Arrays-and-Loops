package Loops;

public class test
{

	public static void main(String[] args)
	{
		char ch[]= {'$','@','t','h','@','T','e','c','h','2','7','Y',
				'E','a','r','$','2','4',	'/','7'};
		/*
		int cvowel=0,cdigit=0;
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]=='a' ||  ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || 
			ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
		{
			cvowel++;
		}
		else if(ch[i]>='0' && ch[i]<='9')
		{
			cdigit++;
		}
		}
		System.out.println("Vowel Count is "+cvowel);
		System.out.println("Digit Count is "+cdigit);
		*/
		
		/*
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' || 
					ch[i]>='0' && ch[i]<='9')
			{
				
			}
			else
			{
				System.out.println(ch[i]);
			}
		}	
		*/
		
		/*
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				sum=sum+(ch[i]-'0');
			}
		}
		System.out.println(sum);
		*/
		
		/*
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				System.out.println(ch[i]);
			}
		}
		*/
		
		/*
		int lc=0,uc=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				lc++;			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				uc++;
			}
		}
		System.out.println("LowerCase "+lc);
		System.out.println("UpperCase "+uc);
		*/
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		//int a[]= {2,5,2,8,3,6,9,3,4,2};
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if((a[i]+a[j]+a[k])==10)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}
}
