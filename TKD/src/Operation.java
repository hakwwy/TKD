
	public enum Operation
	{
		ADD			("+",1),
		SUBTRACT	("-",1),
		MULTIPLY	("*",2),
		DIVISION	("/",2),
		POWER		("^",3),
		EQUALS		("=",3),
		LBRACKET	("(",0),
		RBRACKET	(")",1);
		String op;
		int priority;
		private Operation(String op,int priority)
		{
			this.op = op;
			this.priority = priority;
		}
		public static double doOperation(Operation o,double a,double b)
		{
			switch(o)
			{
				case ADD: return a+b;	
				case SUBTRACT: return a-b;	
				case MULTIPLY: return a*b;	
				case DIVISION: return a/b;	
				case POWER: return Math.pow(a,b);
				default: return 0;
			}
		}
	}