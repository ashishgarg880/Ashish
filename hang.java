public class hang  extends Thread implements Runnable{  
  
    @Override  
    public void run() {  
       for (int i=0;i<=5;i++) {
        	try{
        		System.out.print(i);
        		Thread.sleep(1000);
        	}
        	catch(Exception ex){
        		System.out.print(ex);
        	}
        } 
    }  
   
    public static void main(String[] args) {  
        hang h1 = new hang();  
        Thread t1= new Thread(h1);
        Thread t2= new Thread(h1);  
        t1.start();
        t2.start();  
    }  
}  