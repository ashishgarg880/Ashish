import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		try{
		    Scanner in = new Scanner(System.in);
		    long t = in.nextLong();
		    while(t-- >0){
		        long n = in.nextLong();
		        long a = in.nextLong();
		        long sum = a;
		        long prod = 1;
		        long score = 0;
		        for(int i=1 ; i<=n ; i++){
		            long ai = in.nextLong();
		            score = ((score + sum * ai)*2)%1000000007;
		            sum = (sum + prod * ai)%1000000007;
		            prod = (prod * 2)%1000000007;
		        }
		        System.out.println(score);
		    }
		}
		catch(Exception e){
		    return;
		}
	}
}
