import java.util.Scanner;

class Below21notAllowedForMarriageEException extends Exception
{
	public Below21notAllowedForMarriageEException(String message){
		System.out.println(message);
	}
}
class CWS_06 
{
	public static void main(String[] args) throws Below21notAllowedForMarriageEException
	{
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the COVID Status: ");
			int age = sc.nextInt();
			if(age >= 21){
				System.out.println("You are Eligible for marriage........!");
			}
			else {
				throw new Below21notAllowedForMarriageEException("Oooops..... your age is: "+age+" You are not Eligible to Marriage.....!");
			}
		}
	}
}
