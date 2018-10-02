
public class vowels {
	public static int vowels(String a)
	{
		
		int count=0;
		for(int i=0;i<a.length()-1;i++)
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int count=0;
		String s="sumalatha";
		int b=vowels(s);
		System.out.println(b);

	}

}
