package se.lexicon.dreas94;

public class BankAccount
{
    private int accNum;
    private int balance;
    private final Customer customer;

    public BankAccount(int accNum, int balance, String customerName, String email, String phoneNum)
    {
        this.accNum = accNum;
        this.balance = balance;
        this.customer = new Customer(customerName, email, phoneNum);
    }

    public void printBankInfo()
    {
        System.out.println("Account ID: " + accNum + "\nBalance: " + balance);
        customer.printCustomerInfo();
    }

    public Boolean Deposit(int amount)
    {
        if(amount < 0)
            return false;

        balance += amount;
        return true;
    }

    public Boolean Withdraw(int amount)
    {
        if(amount < 0 && balance - amount < 0)
            return false;

        balance -= amount;
        return true;
    }

    public int GetAccNum()
    {
        return accNum;
    }
    public void SetAccNum(int accNum)
    {
        this.accNum = accNum;
    }
    public int GetBalance()
    {
        return balance;
    }
    public void SetBalance(int balance)
    {
        this.balance = balance;
    }
}
