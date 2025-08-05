import java.util.Scanner;
class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String msg){
		System.out.println(msg);
	}
}
class ATM 
{
	public static void main(String[] args) throws InsufficientBalanceException
	{
		int amount = 50000;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Enter your balanace: ");
			int balance = sc.nextInt();
			try {
				if (balance>amount) {
					throw new InsufficientBalanceException("Not enough balance!");
				} else {
					balance -= amount;
					System.out.println("Withdrawal successful. Remaining balance: " + balance);
				}
			} catch (InsufficientBalanceException e) {
				System.out.println("Exception caught: " + e.getMessage());
			}
			System.out.println("-------------");
		    System.out.println("Thank you!");
		}
	}
}
