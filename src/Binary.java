package searching;

import java.util.Scanner;

public class Binary {
	 public static int binarySearch(int[] a, int key) {
		 int start=0;
		 int end=a.length-1;
		 while(start<=end)
		 {
			 int mid=(start+end)/2;
			 if(key==a[mid])
			 {
				 return mid;
			 }
			 if(key<=a[mid])
			 {
				 end=mid-1;
			 }
			 else
			 {
				 start=mid+1;
			 }
		 }
		 return -1;
			
			 
		 
		
	
		
		 }
	 
         

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter elements of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		System.out.println("enter key position"+BrySearch(a,14));
		
		
		
}

	}




