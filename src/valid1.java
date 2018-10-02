import java.util.Scanner;

public class valid1 {
	public static Boolean isValidName(String s){
		int count=0;
		if(s.length>=)
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)==a||s.charAt(i)==e||s.charAt(i)==i||s.charAt(i)==o||s.charAt(i)==u)
			{
				count++;
			}
			if(count==1)
			{
				System.out.println("valid name");
				
				
			}
			else
			{
				System.out.println("invalid");
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter string");
		String s=sc.next();
		isValidName(s);

	}

}
