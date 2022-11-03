package bank;

public class AxisBank extends Bankinfo {
	public void Deposit() {
		System.out.println("10000");
	}
	public static void main(String[] args) {
		AxisBank account=new AxisBank();
		account.saving();
		account.fixed();
		account.Deposit();
		System.out.println(account);
	}

}

