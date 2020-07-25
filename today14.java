import java.util.*;
public class today
{
	Scanner sc = new Scanner(System.in);
	class base(int roll,String)
	{
		System.out.print("Please enter the student name: ");
		student=sc.next();
		System.out.print("Please Enter the Roll no: ");
		roll=sc.next();
	}
}

	 public class info extends today
	 {
		void show()
		{
		System.out.print("Roll no: "+roll);
		System.out.print("Student Name "+student);
		}
	}
class total{
	public static void main(String[] args) {
		info i1 = new info();
		i1.base();
	}
}