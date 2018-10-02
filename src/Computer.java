
public class Computer {
public static void main (String[] args){
	String s="TIGER";int sm=0;
	for(int i=0;i<s.length();i++)
	{
	if((s.charAt(i)>=65)&&(s.charAt(i)<=90)){
		sm=sm+s.charAt(i);
	}
	}
	
	System.out.println(sm);
	}	

}
