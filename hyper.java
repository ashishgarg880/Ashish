import java.util.Scanner;
class hyper{
Scanner sc=new Scanner(System.in);
int a,b;
static int sum;
	void class1()
    {
        
        System.out.println("Enter The First Number:");
        a=sc.nextInt();
        System.out.println("Enter the Second Number:");
        b=sc.nextInt();
          
          sum=a+b;
          System.out.println("Answer is:"+sum);

	     } 
      
      public static void main(String args[])
      {
      	hyper h1= new hyper();
      	h1.class1();
       if(sum==0)
       {
       	System.out.println("Please Check Statement");
       }
       else
       {
       	System.out.println("Thanks");
       }
      }
      }



