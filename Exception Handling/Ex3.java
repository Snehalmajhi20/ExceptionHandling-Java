class Ex3 
{
	public static void main(String[] args) 
	{
		int a = 11;
		int b = 0;
		int c = a/b;
		try{
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}
