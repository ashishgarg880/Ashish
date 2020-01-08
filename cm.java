import java.util.*;

class cm{
int x,y,sum;
Scanner sc = new Scanner(System.in);

  void mem()
  {
    System.out.println("Enter Number");
    x=sc.nextInt();
    System.out.println("Enter Second Number");
    y=sc.nextInt();

    sum=x+y;
    System.out.println("Answer is"+sum);

  }

   void con()
  {
     System.out.println("Please try again code");

  }
  
}

class vb extends cm{

    void m()
    {
    	super.mem();
       System.out.println("OK");

    }
}

class cnd{
       static int x;
	public static void main(String[] args) {
		vb v1 = new vb();
		
      if(x!=0)
      {
       cm c1= new cm();
       c1.con();
      }
      else{
      	v1.m();
       }
	}
}