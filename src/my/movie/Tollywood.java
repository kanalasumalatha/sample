package my.movie;

public class Tollywood extends Movie
{
	public Tollywood(int ratings,int duration,int cost)
	{
		super(ratings,duration,cost);
	}
public void start()
{
	System.out.println("9am");
}
public void end()
{
	System.out.println("12pm");
} 

}
