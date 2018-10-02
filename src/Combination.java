
public class Combination {
	public static String Combination(String a)
	{
		String letters="";
		String numbers="";
		String k="";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)>=65&&a.charAt(i)<=90)
			{
				letters=letters+a.charAt(i);
			}
			if(a.charAt(i)>=48&&a.charAt(i)<=57)
			{
				numbers=numbers+a.charAt(i);
			}
		}
		k=letters+numbers;
		System.out.println(k);
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABC34JGV";
		Combination(s1);

	}

}
