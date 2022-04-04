package Ques3.spring.assignment;


	

public interface BankAccountRepository {
	public double getAccountBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
	double getBalance(long accountId);
	

}


