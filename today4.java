import java.util.Scanner;
import java.util.*;
class today4{
	Scanner sc = new Scanner(System.in);
	int n, b;  
	int[] a= new int[1000000];
	void solve()
	{
		n=sc.nextInt();
		b=sc.nextInt();

		for (int i=0;i<n;i++)
		
			a[i]=sc.nextInt();
		Arrays.sort(a,a+n);
		int ans=0;

		for (int i=0;i<n;i++)
		{
			if (b>=a[i])
			{
				b-=a[i];
				ans++;
			}
		}
			
			System.out.print(ans);
	
	}


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t--)
		solve();
	}
}