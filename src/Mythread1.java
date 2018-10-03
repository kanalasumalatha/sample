package searching;

public class Mythread1 implements Runnable{
	public void run()
	{
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t=new Mythread();
		Thread t1=new Thread(t);
		t.start();
		System.out.println("main is executed");

	}

}
