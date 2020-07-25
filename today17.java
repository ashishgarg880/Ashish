import java.util.*;
class triangular
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) 
		{
			int num=(i*(i+1))/2;	
			System.out.println(" "+num);
		}
	}
}

class cube
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				System.out.print(" * ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}

class triangle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,n;
		System.out.print("Enter the number of array: ");
		a=sc.nextInt();
		for (int i=0;i<a/2;i++) 
		{
			for (int j=0;j<a;j++) 
			{
				System.out.print("\n");
			}
			for (int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.print("*");
		}
	}
}