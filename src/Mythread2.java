package searching;

class Myt implements Runnable{
	public void run()
	{
	for(int i=1;i<=100;i++)
	{
		System.out.println(i+" ");
	}
	}
}
public class Mythread2
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myt t=new Myt();
Thread t1=new Thread(t);
t1.start();
for(int i=100;i>1;i--)
{
	System.out.println(i+" ");
}
}
}


