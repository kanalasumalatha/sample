package my.movie;

public class Bollywood extends Movie
{
	public Bollywood(int ratings,int duration,int cost)
	{
		super(ratings,duration,cost);
	}
public void start()
{
	System.out.println("10am");
}
public void end()
{
	System.out.println("11am");
 
}
}
