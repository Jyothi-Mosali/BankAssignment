import java.time.LocalDate;
public class CurrentAccount extends Account 
{
	private double overDraftLimit;
	public CurrentAccount() { }
	public CurrentAccount(int accountNo, LocalDate date, double balance,double overDraftLimit) 
	{
		super(accountNo, date, balance);
		this.overDraftLimit = overDraftLimit;
	}
	public double validateOverDraftLimit(double overDraftLimit)
	{
		return overDraftLimit<1000 ? 1000 : overDraftLimit;
	}
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
}
