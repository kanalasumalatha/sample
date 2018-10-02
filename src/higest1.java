
public class higest1 {
	public static String highest1(String a)
	{
		String[] b=a.split(" ");
		String k=k[0];
		for(int i=0;i<k.length();i++)
		{
			for(int j=i+1;j<k.length();j++)
			{
				if(k.length()<k[j].length())
				{
					k=k[j];
				}
			}
		}
		return a;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i am sumalatha";
		String c=highest1(s);
		System.out.println(c);

	}

}
