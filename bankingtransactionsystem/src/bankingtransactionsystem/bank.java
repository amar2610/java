package bankingtransactionsystem;

public interface bank {
	int min_balance=1000;
	int depo_limit=20000;
	void deposite(Account account,int amount);
	void withdraw(Account account,int amount);

}
