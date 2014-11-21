import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
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
		Queue<String> queue = new LinkedList<String>();
		switch(type)
		{
			case NORMAL:
			{
				while(!expression.isEmpty())
				{
					s = expression.substring(0, 1);
					expression = expression.substring(1, expression.length());
					if(Notation.isNumber(s))
						queue.offer(s);
					else
					{
						queue.offer(" ");
					}
					if(Notation.isOperation(s))
					{
						while(!stack.isEmpty())
							if(Notation.getOperation(s).priority <= Notation.getOperation(stack.peek()).priority)
								queue.offer(stack.pop());
							else break;
						stack.push(s);
					}
					if(Notation.isLBRACKET(s))
							stack.push(s);
					if(Notation.isRBRACKET(s))
						while(!stack.isEmpty())
						{
							if(!Notation.isLBRACKET(stack.peek()))
								queue.offer(stack.pop());
							else
							{
								stack.pop();
								break;
							}	
						}	
				}
				while(!stack.isEmpty())
					queue.offer(stack.pop());
				s="";
				while(!queue.isEmpty())
					s+=queue.poll();
				return s;				
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
	
	private static boolean isNumber(String s)
	{
		for(Number num: Number.values())
			if(s.equals(num.num))
				return true;
		return false;
	}
	
	private static boolean isOperation(String s)
	{
		for(Operation op: Operation.values())
			if(s.equals(op.op) & !op.equals(Operation.RBRACKET) & !op.equals(Operation.LBRACKET))
				return true;
		return false;
	}
	
	private static Operation getOperation(String s)
	{
		for(Operation op: Operation.values())
			if(s.equals(op.op))
				return op;
		return null;
	}
	
	private static boolean isLBRACKET(String s)
	{
		if(s.equals(Operation.LBRACKET.op))
			return true;
		return false;
	}
	
	private static boolean isRBRACKET(String s)
	{
		if(s.equals(Operation.RBRACKET.op))
			return true;
		return false;
	}
	
}
