package Ques3.spring.assignment;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class BankAccountcontroller extends BankAccountServiceImpl  {
	

	  private ApplicationContext context;
	    public double withdraw(long accountId, double balanceToBeWithdraw){
	        double newBalance=0;
	        BankAccountServiceImpl acc=(BankAccountServiceImpl) context.getBean("BankRepo");
	        if(acc.getBalance(accountId)>=balanceToBeWithdraw)
	            newBalance = acc.getBalance(accountId)-balanceToBeWithdraw;
	        acc.updateBalance(accountId, newBalance);
	        return newBalance;
	    }
	    public double deposit(long accountId, double balance){
	        BankAccountServiceImpl acc=(BankAccountServiceImpl) context.getBean("BankRepo");
	        double Newbalance = acc.getBalance(accountId)+balance;
	        return acc.updateBalance(accountId,Newbalance);

	    }
	    public double getBalance(long accountId){

	        BankAccountServiceImpl balance=(BankAccountServiceImpl) context.getBean("BankRepo");
	       return balance.getBalance(accountId);

	    }
	    public boolean fundTransfer(long fromAccount, long toAccount, double amont){
	        BankAccountServiceImpl accountepository=(BankAccountServiceImpl) context.getBean("BankRepo");
	        if(accountepository.getBalance(fromAccount)>=amont){
	           double updatedAmt= amont+accountepository.getBalance(toAccount);

	           // updating both the accounts
	            accountepository.updateBalance(toAccount, amont);
	            accountepository.updateBalance(toAccount,updatedAmt);
	            return true;
	        }
	        return false;
	    }

	    @Override
	    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	        this.context=applicationContext;
	    }
	    
}
	
