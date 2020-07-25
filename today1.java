import java.util.*;

class today1
{
	public static void findMissedValue(int a[],int totalnumber) 
	{
		totalnumber=100;
		int b[]=new int[totalnumber];
			for (int i=0;i<a.length ;i++) 
			{
				int v= a[i];
				b[v]=1;
			}
			for (int j=0;j<totalnumber ;j++ )
			{
				if(b[j]==0)
				{
					System.out.print(""+j);
				}
			}
	}

	public static void main(String[] args) {
		today1 td = new today1();
	}
}

class pyramid{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the floor of pyraid:");
		int n=sc.nextInt();
		int spc,str=1;

		spc=n-1;

		for (int i=0;i<n;i++) 
		{
			for (int j=0;j<=spc;j++)
			{
				System.out.print(" ");	
			}
			for (int j=0;j<str;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			spc=spc-1;
			str+=2;
		}
	}
}

class pyramid1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the floor of pyraid:");
		int n=sc.nextInt();
		int spc,str=1;

		spc=n-1;

		for (int i=0;i<n;i++) 
		{
			for (int j=0;j<spc+2;j++)
			{
				if (j>spc)
				{
					System.out.print(" *");			
				}
				else
				{
					System.out.print("\n");
					System.out.print("uy");
				}

			}
		}
	}
}