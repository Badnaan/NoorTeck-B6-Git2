package git2;
// coming from remote...
public class DemoTwo {
	
	public static void main(String[] args) {
		
		System.out.println("Git demo 2...");
		
		sub(2, 3);
		
		DemoTwo obj = new DemoTwo();
		
		obj.add(2,3);
		
		obj.chicken (1, 1);
	}
	
	public void add (int a, int b)
	{
		System.out.println(a+ b);
	}
	public static void sub (int z, int xc )
	{
		System.out.println(z - xc);
	}
	public void chicken (int egg , int chicken)
	{
		System.out.println("Who came first? " + egg + chicken);
		System.out.println (egg / chicken);
	}

}
