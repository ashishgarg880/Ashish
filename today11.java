import java.util.*;
import java.lang.*;
class today1{
	public static void main(String[] args) {
		int temp,num;
		boolean isprime=true;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no who is number is prime or not: ");
		num=sc.nextInt();
		sc.close();
		for (int i=2;i<=num/2;i++) {
			temp=num%i;
			if (temp==0) {
				isprime=false;
				break;
			}
		}
		if (isprime) {
			System.out.println(num+" number is prime number");
		}
		else{
			System.out.println(num+" number is not prime number");
		}
	}
}

class today{
	public static void main(String[] args) {
		int num, a=0,b=0,c=1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of times: ");
		num=sc.nextInt();
		System.out.println("Fibonacci Series number: ");
		for (int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
	}
}

class toda{
	public static void main(String[] args) {
		int i,j,a,k;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of time " );
		a=sc.nextInt();
		for (i=0;i<=a;i++) {
			for(j=0;j>=i;j++){
				System.out.print("*");
			}
			for (j=i; j>a;j--) {
				System.out.println(j+"j");
			}
			System.out.println(i+"i");
		}	
	}
}