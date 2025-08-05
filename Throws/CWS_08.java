class FileReaderExample
{
	public void readfile() throws  InterruptedException{
		System.out.println("I'm Reading the file!");
		openfile();
	}
	public void openfile() throws  InterruptedException{
		System.out.println("I'm Opened the file!");
		processfile();
	}
	public void processfile() throws  InterruptedException{
		//br.close();
		System.out.println("I'm Processing the file!");
		Thread.sleep(1000);
	}
}
class CWS_08
{
	public static void main(String[] args) throws InterruptedException
	{
		FileReaderExample fre = new FileReaderExample();
		fre.readfile();
		System.out.println("End the Program!");
	}
}
