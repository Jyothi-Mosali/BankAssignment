import java.time.LocalDate;
public class Account 
{
	private int accountNo;
	private LocalDate openedDate;
	private double balance;
	public Account() { }
	public Account(int accountNo, LocalDate openedDate, double balance) 
	{
		this.accountNo = accountNo;
		this.openedDate = openedDate;
		this.balance = balance;
	}
	public int getAccountNo() 
	{
		return accountNo;
	}
	public void setAccountNo(int accountNo) 
	{
		this.accountNo = accountNo;
	}
	public LocalDate getOpenedDate() 
	{
		return openedDate;
	}
	public void setOpenedDate(LocalDate date) 
	{
		this.openedDate = openedDate;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
}
