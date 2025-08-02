class Ex1 
{
	public static void main(String[] args) 
	{
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ae){
			System.out.println(ae);
		}
		//System.out.println("Hello World!");
	}
}
