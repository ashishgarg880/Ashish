import java.util.*;
class today13{
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		for (int i=0;i<=a;i++)
		{
			System.out.print(i);

			for (int j=a;j<i;j++) {
				System.out.println(" ");
			}
			for (int j=i;j<6;j++) {
				System.out.println("*");
			}
			System.out.print("\n");
		}
	}
}