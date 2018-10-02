
public class first {
	public static String first(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(i==0)
			{
				char s1=s.charAt(i);
				System.out.println(s1);
			}
		
			
		}
		for(int j=s.length()-1;j>=0;j--)
		{			if(j==s.length()-1)	{
				char s2=s.charAt(j);
				System.out.println(s2);	}
		}
		
	return s;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sumalatha";
		first(s);

	}

}
