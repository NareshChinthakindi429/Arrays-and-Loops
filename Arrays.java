
public class Arrays 
{

	public static void main(String args[])
	{
		
		// Loop Programs
		
		// ******** Remove Duplicate Elements ********
//		int a[]= {71,77,71,72,71,70,-98};
//		
//		System.out.println("Before Remove Duplicate Elements");
//		for(int y:a)
//		{
//			System.out.println(y);
//		}
//		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					a[i]=0;
//				}
//			}
//		}
//		System.out.println("After Removing Duplicate Elements");
//		for(int x:a)
//		{
//			if(x>0)
//			{
//				System.out.println(x);
//			}
//		}
		
		// ******** Duplicate Remove ********
		
//		int a[]= {0,71,77,71,72,71,0,70,-98,0};
//		int len=a.length;
//		for(int i=0;i<len;i++)
//		{
//			for(int j=i+1;j<len;j++)
//			{
//				if(a[i]==a[j])
//				{
//					for(int k=j;k<len-1;k++)
//					{
//						a[k]=a[k+1];
//					}
//					len--;
//					j--;
//				}
//				
//			}
//		}
//		for(int x=0;x<len;x++)
//		{
//			
//			System.out.println(a[x]);
//			
//		}
		
		
		
		
		
		// ******** Frequency of Element ********
		
//		int a[]= {12,13,13,7,8,11,13,11};
//		int cnt;
//		for(int i=0;i<a.length;i++)
//		{
//			cnt=0;
//			for(int j=0;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					cnt++;
//				}
//			}
//			System.out.println(a[i]+":"+cnt);
//		}
		
		// ******** Largest Element ********
//		int a[]= {15,7,8,9,12,-31};
//		int max=a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>max)
//			{
//				max=a[i];
//			}
//		}
//		System.out.println("Max is :- "+max);
		
		
		
		//  ******** Sort Elements ********
//		int a[]= {15,21,-11,8,-1,2};
//		int temp=0;
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++) 
//			{
//				if(a[i]>a[j])
//				{
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		System.out.println("After Sorting :-");
//		for(int x:a)
//		{
//			System.out.print(x+" ");
//		}
		
		
		
		//	******** Sum Of all Elements ********
		
//		int a[]= {15,7,12,13,-11};
//		int sum=0;
//		for(int i=0;i<a.length;i++)
//		{
//			sum=sum+a[i];
//		}
//		
//		System.out.println("Sum Of Elements is :- "+sum);
	
			
			
		
		// ********* Find the Second Smallest Element *********
		
//		int a[]= {17,10,9,11,5,4,21,3,1};
//		
//		int small=a[0],smin=a[1];
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]<small)
//			{
//				smin=small;
//				small=a[i];
//			}
//			else if(smin>a[i])
//			{
//				smin=a[i];
//			}
//		}
//		System.out.println(smin);
		
		
		
		// ******** Find the missing Elements in the Array ********
		
//		int a[]= {3,7,9,11,17};
//		int p;
//		for(int i=3;i<17;i++)
//		{
//			p=0;
//			for(int j=0;j<a.length;j++)
//			{
//				if(a[j]==i)
//				{
//					p=1;
//					break;
//				}
//			}
//			if(p==0)
//			{
//				System.out.println(i);
//			}			
//		}
		
		// ******** Count the Number of Prime Numbers ********
		
//		int a[]= {7,21,35,11,16,2,21,7};
//		
//		int cnt=0,p;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			p=0;
//			int n=a[i];
//			for(int j=2;j<n/2;j++)
//			{
//				if(n%j==0)
//				{
//					p=1;
//					break;
//				}
//			}
//			if(p==0)
//			{
//				//System.out.println(a[i]);
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
		
		
		
		
		
	}
	
}
