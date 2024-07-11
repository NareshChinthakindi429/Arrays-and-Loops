package Arrays;

public class arrayTest 
{

	public static void main(String[] args) 
	{
		int a[]= {15,18,21,32,41};
		int index=3;
		int b[]=new int[a.length-1];		
		for(int i=0,j=0;i<a.length;i++)
		{
			if(i==index)
			{
				continue;
			}
			b[j++]=a[i];	
		}
		System.out.println("After Removing Array Element");
		for(int x:b)
		{
			
			System.out.print(x+" ");
		}
	}

}
