import java.time.LocalDate;
import java.util.*;
public class MainBank 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no.of accounts to be entered : ");
		int n = sc.nextInt();
		Account a;
		
		Bank b = new Bank("SBI","Abcd");
		/*
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the type of account(1/2)--");
			System.out.println("1.Savings Account,  2.Current Account");
			int x = sc.nextInt();
			System.out.println("Enter AccountNo : ");
			int accountNo = sc.nextInt();
			System.out.println("Enter Date : ");
			System.out.println("Enter year");
			int y = sc.nextInt();
			System.out.println("Enter month");
			int m = sc.nextInt();
			System.out.println("Enter day");
			int d = sc.nextInt();
			LocalDate date = LocalDate.of(y,m,d);
			System.out.println("Enter Balance : ");
			double balance = sc.nextDouble();
			if(x==1)
			{
				System.out.println("Enter Minimum Deposit : ");
				int minimumDepositAmount = sc.nextInt();
				System.out.println("Enter No.of transactions per day : ");
				int noOfTransactionsPerDay = sc.nextInt();
				a[i] = new SavingsAccount(accountNo, date, balance, minimumDepositAmount, noOfTransactionsPerDay);
				System.out.println(b.addAccount(a[i])); 
			}
			else
			{
				System.out.println("Enter Overdraft Limit : ");
				int overDraftLimit = sc.nextInt();
				a[i] = new CurrentAccount(accountNo, date, balance, overDraftLimit);
				System.out.println(b.addAccount(a[i])); 
			}
		}
		*/
		a = new CurrentAccount(7000,LocalDate.now(),45000,1000);
		System.out.println(b.addAccount(a));
		a = new SavingsAccount(7001,LocalDate.of(2023, 4, 6),45000,1000,5);
		System.out.println(b.addAccount(a));
		int id = 7003;
		for(int i=2; i<n-1; i++)
		{
			a = new SavingsAccount(id++,LocalDate.now(),500000,10000,5);
			System.out.println(b.addAccount(a));
		}
		a = new CurrentAccount(7002,LocalDate.now(),40000,10000);
		System.out.println(b.addAccount(a));
		b.showAccounts();
		b.transaction('d', 7000,1500);
		b.showAccounts();
	}
}
