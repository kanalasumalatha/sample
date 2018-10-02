package searching;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,5,6,3,2};
		int x=6;int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				count++;
				System.out.println(a[i]);
				
			
			}
			else
			{
				System.out.println("element not found");
				
			}
		
		}

	}

}
