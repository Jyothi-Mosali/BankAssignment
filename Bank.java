
public class Bank 
{
	private String bankName;
	private String branchName;
	private Account[] accounts;
	private int index = 0;
	public Bank() { }
	public Bank(String bankName, String branchName) 
	{
		accounts = new Account[10];
		this.bankName = bankName;
		this.branchName = branchName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public boolean addAccount(Account account)
	{
		if(index <10) 
		{
			accounts[index++] = account;
			return true;
		}
		throw new RuntimeException("Cannot add account");
	}
	public void showAccounts()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("     ---Account Details---    ");
			System.out.println("AccountNo       : " + accounts[i].getAccountNo());
			System.out.println("Opened Date     : " + accounts[i].getOpenedDate());
			System.out.println("Enter Balance   : " + accounts[i].getBalance());
			if(accounts[i] instanceof SavingsAccount)
			{
				SavingsAccount s = (SavingsAccount) accounts[i];
				System.out.println("Minimum Deposit : " + s.getMinimumDepositAmount());
				System.out.println("No.of transactions per day : " + s.getNoOfTransactionsPerDay());
			}
			else
			{
				CurrentAccount c = (CurrentAccount) accounts[i];
				System.out.println("Overdraft Limit : " + c.getOverDraftLimit());
			}
		}
	}
	public boolean transaction(char ttype, int accountNo, double amount)
	{
		Account acc = null;
		for(int i=0;i<index;i++)
		{
			if(accounts[i].getAccountNo()==accountNo)
			{
				acc = accounts[i];
				break;
			}
		}
		if(acc==null)
			return false;
		
		double minbal = 1000;
		if(acc instanceof SavingsAccount)
		{
			SavingsAccount s = (SavingsAccount) acc;
			minbal = s.getMinimumDepositAmount();
		}
		else
		{
			CurrentAccount s = (CurrentAccount) acc;
		}
		double bal = acc.getBalance();
		if(bal-amount>= minbal)
			acc.setBalance(bal-amount);
		return true;
	}
}
