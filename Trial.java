
public class Trial {

	static int i=10;
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(Trial.i);//standard 
		
		foo();
		Trial.foo();//standard
		
		
	}

	public static void foo()
	{
		System.out.println(i);
		System.out.println(Trial.i);//standard
	}
}
