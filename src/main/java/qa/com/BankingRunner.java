package qa.com;

public class BankingRunner {

	public static void main(String[] args) {
		Banking person1 = new Banking()
				.accountNumber(00000001)
				.owner("Adam")
				.branch("Santander")
				.balance(100)
				.interestRate(0.15)
				.Bankbuild();
		
		System.out.println(person1);

	}

}
