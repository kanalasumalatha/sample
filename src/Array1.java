import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {

	public static <Int> void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Int>al=new ArrayList<Int>();
 al.add(0, null);
Iterator<Int> itr=al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
 
	}

}
