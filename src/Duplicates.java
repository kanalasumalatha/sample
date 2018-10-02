
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,6,5,6,6};int c=0;
		for(int i=0;i<a.length;i++)
		{
			 int c1=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			} 
			
		System.out.println(c);

		}
}
}
