import java.time.LocalDate;
public class SavingsAccount extends Account 
{
	private double minimumDepositAmount;
	private int noOfTransactionsPerDay;
	public SavingsAccount() {}
	public SavingsAccount(int accountNo, LocalDate date, double balance,double minimumDepositAmount, int noOfTransactionsPerDay) 
	{
		super(accountNo, date, balance);
		this.minimumDepositAmount = minimumDepositAmount;
		this.noOfTransactionsPerDay = noOfTransactionsPerDay;
	}
	public double validateMinimumDepositAmount(double minimumDepositAmount)
	{
		return minimumDepositAmount<1000 ? 1000 : minimumDepositAmount;
	}
	public double getMinimumDepositAmount() 
	{
		return minimumDepositAmount;
	}
	public void setMinimumDepositAmount(double minimumDepositAmount) 
	{
		this.minimumDepositAmount = validateMinimumDepositAmount(minimumDepositAmount);
	}
	public int validateNoOfTransactionsPerDay(int noOfTransactionsPerDay) 
	{
		return noOfTransactionsPerDay<0 && noOfTransactionsPerDay>100 ? 100 : noOfTransactionsPerDay;
	}
	public int getNoOfTransactionsPerDay() 
	{
		return noOfTransactionsPerDay;
	}
	public void setNoOfTransactionsPerDay(int noOfTransactionsPerDay) 
	{
		this.noOfTransactionsPerDay = validateNoOfTransactionsPerDay(noOfTransactionsPerDay);
	}
}
