package searching;

public class Mythread extends Thread{
	
		public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){
 
	Mythread t=new Mythread();
	t.start();
	
	System.out.println("program is running");
		
		 }  
		}  
