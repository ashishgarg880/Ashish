class Dog{  
 private void eat(){System.out.println("dog is eating...");}  
  }

class cat extends Dog{
	void eat(){System.out.print("Cat is eating");}
	super.eat(){
		System.out.print("dog");
	}
 public static void main(String args[]){  
  
  Dog d1=new cat();  
  d1.eat();  
 }  
} 