
public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Notation n = new Notation();
		System.out.println(Notation.toRPN("33+433*2/(13-52)^2", ExpType.NORMAL));
	}

}
