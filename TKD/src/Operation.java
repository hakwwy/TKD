
	public enum Operation
	{
		ADD("+",1),
		SUBTRACT("-",1),
		MULTIPLY("*",2),
		DIVISION("/",2),
		POWER("^",3),
		EQUALS("=",3),
		LBLACKET("(",0),
		RBRACKET(")",1);
		String op;
		
		private Operation(String op,int priority)
		{
			this.op = op;
		}
		
	}