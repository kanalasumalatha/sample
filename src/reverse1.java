
public class reverse1 {
	public static String reverse1(String a)
	{
		String s1="";
		for(int i=a.length()-1;i>=0;i--)
		{
			s1=s1+a.charAt(i);
		}
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="suma";
		String b=reverse1(s);
		System.out.println(b);

	}

}
