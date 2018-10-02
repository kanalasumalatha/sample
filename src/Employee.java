package searching;


public class Employee {
	private String name;
	int age;
	public void setAge(int age) throws InvalidAgeException
	{
		if(age<0)
		{
			throw new InvalidAgeException();
		
		
		}
		else
		{
			this.age=age;
		}
		
	}
}

	