import java.util.*;


class today6
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number:");
		int x,y,i;
		x=sc.nextInt();
		for (i=0;i<x;i++)
		{
			for (y=0;y<x;y++)
			{
				System.out.print("*");
			}
			System.out.print("\n");	
		}	
	}
} 


class today
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number:");
		int x,y,i;
		x=sc.nextInt();
		for (i=0;i<x;i++)
		{	
			for(y=0;y<x;y++)
			{
				if((y>=i))
				{
					System.out.print("*");
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}		
	}			
} 

class toda
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number:");
		int x,y,i;
		x=sc.nextInt();
		for (i=0;i<x;i++)
		{	
			for(y=0;y<x;y++)
			{
					System.out.print(+y+i);
				
			}
			System.out.print("\n");
		}		
	}			
} 

class tod
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number:");
		int x,y,i;
		x=sc.nextInt();
		for (i=0;i<x;i++)
		{	
			for(y=1;y<=x;y++)
			{															
				System.out.print(+i+y);
			}
			System.out.print("\n");
		}	
	}			
} 