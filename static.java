class c1{
	int i;
	 static String name="EEC"; 

	 static void update()
	 {
	 	name="EEC Classes";
	 }

	 void display(){
	 	System.out.print(name);
	 }
	public static void main(String[] args) {
		c1 c1=new c1();
		update();
		c1.display();
	}
}