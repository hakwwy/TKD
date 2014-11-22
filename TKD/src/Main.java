
public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try {System.out.println(Notation.toRPN("a+b*2/(1-5)^2", ExpType.INFIX));}
		catch(IllegalArgumentException e){System.out.println("b³êdny argument");}
		System.out.println(Operation.doOperation(Operation.POWER, 15, 4));
	}

}
