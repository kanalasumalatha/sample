package searching;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception2 {
	public void ab()throws FileNotFoundException
	{
	try{
		FileReader fr=new FileReader("D//a.txt");
	}
	catch(FileNotFoundException e)
	{
		System.out.println("file is found");
	}
		
	}

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		Exception2 e=new Exception2();
	 e.ab();

	}

}
