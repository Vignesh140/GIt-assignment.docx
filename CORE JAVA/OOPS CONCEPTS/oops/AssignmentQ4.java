package oops;


import java.util.ArrayList;

abstract class Bank{
	String bankName;
}
abstract class Customer extends AssignmentQ4{
	int AccountNumber;
	String name;
	String accountType;
	
}
class Current extends AssignmentQ4 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return totalDeposits-creditLimit;
    }
}
class Save extends AssignmentQ4 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return totalDeposits-fixedDepositAmount;
    }
}
abstract class num extends Customer{
	
}
public abstract class AssignmentQ4 {
    public static int totalCashInBank(ArrayList<Integer> cash){
    	int sum=0,i;
    	for (i=0;i<cash.size();i++) {
    		sum += cash.get(i);
    	}
    	return sum;
    }
    public abstract int getCash();
    public static void main(String[] args) {
    	Current currentAccountTotal = new Current();
    	Save savingsAccountTotal = new Save();
    	ArrayList<Integer> cash = new ArrayList<>();
    	cash.add(currentAccountTotal.getCash());
    	cash.add(savingsAccountTotal.getCash());
    	System.out.println(totalCashInBank(cash));
    	
    }
}


