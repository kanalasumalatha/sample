import java.util.Arrays;

public class arra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a={13,2,14,16,5,3,1};
		Arrays.sort(a);
		int E=a[a.length-1];
		int c=3;
				
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]!=E)
			{
				c--;
				E=a[i];
				
			}
			if(c==1)
			{
				System.out.println(E);
				break;
			}
			
		}
		
		}
	}

		
				
		
		
