class Ex2 
{
	public static void main(String[] args) 
	{
		String name = "Snehal";
		System.out.println("Name of 4th char in string name is: "+name.charAt(4));
		try{
			System.out.println(name.charAt(7));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}
