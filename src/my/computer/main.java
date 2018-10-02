package my.computer;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c=new Company();
		c.id=12;
		c.name="xyz";
		
		
		Motherboard b=new Motherboard();
		b.id=121;
		b.ratings=5;
	
		b.c=c;
		System.out.println(b.c.name);
		Moniter m=new Moniter();
		m.size=20;
		m.width=10;
		m.height=5.2;
		System.out.println(m.height);
		Mouse m1=new Mouse();
		m1. type="dell";
		System.out.println(m1.type);
		

	}

}
