
public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try {System.out.println(Notation.toRPN("a+b*2/(1-5)^2", ExpType.NORMAL));}
		catch(IllegalArgumentException e){System.out.println("b³êdny argument");}
	}

}
