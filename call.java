class call{
	int data=50;
	void change(int data){  
 	data=data+100;//changes will be in the local variable only  
 }  
	public static void main(String[] args) {
	call c1 = new call();
	System.out.println("before"+c1.data);
	c1.change(500);
	System.out.println("after"+c1.data);	
	}
}