class abc{
void m1(int i)
{
System.out.println(i);
}

void m1(int j, int k)
{
System.out.println(j+k);
}
}
 class over
{
public static void main(String a[])
{
abc a1= new abc();
a1.m1(23);
a1.m1(23,44);
}

}