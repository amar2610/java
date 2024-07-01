package bankingtransactionsystem;

public class transactions implements bank{
	public void deposite(Account account,int amount) {
		account.setbal(account.getbal()+amount);
	}
	public void withdraw(Account account,int amount) {
		account.setbal(account.getbal()-amount);
	}
}
