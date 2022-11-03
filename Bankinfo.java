package bank;

public class Bankinfo {
	public void saving() {
		System.out.println("10000");
	}
	public void fixed() {
		System.out.println("2000");
	}
	public void deposit() {
		System.out.println("5000");
	}
	public static void main(String[] args) {
		Bankinfo acc=new Bankinfo();
		acc.saving();
		acc.fixed();
		acc.deposit();
		System.out.println(acc);
	}

}

