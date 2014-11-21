
	public enum Operation
	{
		ADD("+"),
		SUBTRACT("-"),
		MULTIPLY("*"),
		DIVISION("/"),
		POWER("^"),
		EQUALS("="),
		LBLACKET("("),
		RBRACKET(")");
		String op;
		
		private Operation(String op)
		{
			this.op = op;
		}
		
	}