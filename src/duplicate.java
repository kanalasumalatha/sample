import java.util.Scanner;

public class duplicate {
	public static String duplicate(String a)
	{
		int count=0;
		String[] b=a.split(" ");
		for(int i=0;i<b.length;i++)
		{
			count=0;
			for(int j=i+1;j<b.length;j++)
			{
				
				if(b[i].equals(b[j]))
				{
					count++;
				}
				
			}
			if(count>=1)
			{
				System.out.println(b[i]);
			}
			
		}
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a string");
		String s=sc.next();
		String s1=duplicate(s);
		System.out.println(s1);
		

	}

}
