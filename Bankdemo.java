package srinath;

public class Bankdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bankAcct = new BankAccount(1000, "Raju", 5000,
				"hyd",
				"9845098450") ;
		
		System.out.println(bankAcct);
		
		bankAcct.deposit(5000);
		bankAcct.checkBalance();
		
		
		bankAcct.withDraw(4000);
		bankAcct.checkBalance();
	}

}
