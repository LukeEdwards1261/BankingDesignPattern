package qa.com;

public class Banking {
	
	private long accountNumber = 00000000;
    private String owner = "";
    private String branch = "No bank given";
    private double balance = 0.00;
    private double interestRate = 0.00;
    
    public Banking() {
    	
    }
    
    public Banking(long accountNumber, String owner, String branch, double balance, double interestRate) {
    	this.accountNumber = accountNumber;
    	this.owner = owner;
    	this.branch = branch;
    	this.balance = balance;
    	this.interestRate = interestRate;
    }
    
    public Banking accountNumber(long accountNumber) {
    	this.accountNumber = accountNumber;
    	return this;
    }
    public Banking owner(String owner) {
    	this.owner = owner;
    	return this;
    }
    public Banking branch(String branch) {
    	this.branch = branch;
    	return this;
    }
    public Banking balance(double balance) {
    	this.balance = balance;
    	return this;
    }
    public Banking interestRate(double interestRate) {
    	this.interestRate = interestRate;
    	return this;
    }
    public Banking Bankbuild() {
//    	Banking account = new Banking();  
//    	account.accountNumber = this.accountNumber;
//        account.owner = this.owner;
//        account.branch = this.branch;
//        account.balance = this.balance;
//        account.interestRate = this.interestRate;
//        return account;

    	return new Banking(accountNumber,owner,branch,balance,interestRate);
    }
    
    //getters and setters

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	//getters and setters
	
	//toString

	@Override
	public String toString() {
		return "Banking [accountNumber=" + accountNumber + ", owner=" + owner + ", branch=" + branch + ", balance="
				+ balance + ", interestRate=" + interestRate + "]";
	}
    
    //toString
    
    
}
