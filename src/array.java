
public class array {
	public static int array(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		 int avg = sum/a.length;
		 System.out.println(avg);
		 
		return avg;
			
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		array(a);

	}

}
