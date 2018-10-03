package searching;
class Myt1 extends Thread
{
	int n=6;
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}

public class Mythraed3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myt1 t=new Myt1();
t.start();

	}

}
