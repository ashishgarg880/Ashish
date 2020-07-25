package inheritance;
class ParentClass
{
   //Parent class constructor
   ParentClass()
   {
	System.out.println("Constructor of Parent");
   }
   void disp()
   {
	System.out.println("Parent Method");
   }
}
class JavaEx extends ParentClass
{
   JavaExample()
   {
	System.out.println("Constructor of Child");
   }
   void disp()
   {
      super.disp();
	  System.out.println("Child Method");
   //Calling the disp() method of parent class
   }
   public static void main(String args[])
   {
	//Creating the object of child class
	JavaEx obj = new JavaEx();
	obj.disp();
   }
}

class parent1{
   String data;
   String data1;
   void show(){
      System.out.print("PLEASE show and cretion of data"+data);
   }
   parent1(){
      System.out.print("showing data "+data1);
   }
}

class child extends parent1{
   child(String data,String data1){
      
   }
}

