import java.util.Stack;


public class Notation 
{
	//polishNotation - PN
	//reversePolishNotation - RPN


	Notation()
	{
		
	}
	public static String toRPN(String expression,ExpType type)
	{
		String s;
		Stack<String> stack = new Stack<String>();
		switch(type)
		{
			case NORMAL:
			{
				s = expression.substring(0, 1);
				expression = expression.substring(1, expression.length());
			}
			case RPN: return expression;
			default: return null;
		}
	}	
	public static String toNormal(String expression,ExpType type)
	{
		switch(type)
		{
			case RPN:
			{
				
			}
			case NORMAL: return expression;
			default: return null;
		}
	}
}
