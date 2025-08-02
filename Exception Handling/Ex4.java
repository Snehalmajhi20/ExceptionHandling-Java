class Ex4 
{
	public static void main(String[] args) 
	{
		String a = null;
		int len = a.length();
		try{
			System.out.println(len);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
	}
}
