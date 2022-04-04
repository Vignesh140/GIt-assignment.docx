package Ques3.spring.assignment;



import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service("service")
public class BankAccountServiceImpl implements BankAccountService, ApplicationContextAware {
    private  ApplicationContext context;

	public double withdraw(long accountId, double balance) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	

	public double updateBalance(long accountId, double newBalance) {
		return 0;
		// TODO Auto-generated method stub
		
	}
}