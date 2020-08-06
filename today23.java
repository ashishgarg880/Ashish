package pack;
import java.util.*;
import java.lang.*;
import java.io.*; 

/* Name of the class has to be "Main" only if the class is public. */
class pack1
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc =  new Scanner(System.in);
		int r = sc.nextInt();
		while(r-->0)
		{
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{	
				arr[i]=sc.nextInt();
			}
			int temp =1;
			for (int j=0;j<n ;j++ ) 
			{
				temp=arr[j];	
			}
			if(temp%2==0)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.print("YES");
			}
		}	
	}
}
