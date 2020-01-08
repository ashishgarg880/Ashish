class star{
public static void main(String a[]){
int i, j;

for(i=5;i>=1;i--)
{
for(j=5;j>=1;j--)
    {
       System.out.print(j);      
       }
      System.out.println("");
       }
   }
}

class star1{
public static void main(String a[]){
int n=5;
int i, j;

for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
    {
if(i==j)
{
       System.out.print("0");      

  }
else
{
System.out.print("X");
}
     }
      System.out.println(" ");
       }
   }
}

class star2
{
 public static void main(String a[]){
int n=5;
int z=1;

for(int i=0;i<n;i++)
{
for(int j=n-1;j>i;j--)
    {
       System.out.print(" ");      
       }
for(int k=0;k<z;k++){
      System.out.print("*");
       }
z+=2;
System.out.println("");
}
   }
}