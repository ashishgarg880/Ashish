class para1
{
void m1(int a,int y,int w)
{
w=12;
int x=y+a+w;
System.out.print(x);
}
}
class para{
public static void main(String a[])
{
para1 p1=new para1();
p1.m1(12,12,23);
}
}
class Test2 
{ 
    // Takes string as a argument followed by varargs 
    static void fun2(String str, int ...a) 
    { 
        System.out.println("String: " + str); 
        System.out.println("Number of arguments is: "+ a.length); 
        
  
        // using for each loop to display contents of a 
        for (int i: a) 
            System.out.print(i + " "); 
  
        System.out.println("\n"); 
    } 
  
    public static void main(String args[]) 
    { 
        // Calling fun2() with different parameter 
        fun2("GeeksforGeeks", 100); 
        fun2("CSPortal", 1, 2, 3, 4, 5); 
        fun2("forGeeks"); 
    } 
}