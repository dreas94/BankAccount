package se.lexicon.dreas94;

import java.util.Arrays;

public class App
{
    private static BankAccount[] bankAccounts = new BankAccount[]{};

    private static void createNewBankAccount(int balance, String customerName, String email, String phoneNum)
    {
        bankAccounts = Arrays.copyOf(bankAccounts, bankAccounts.length + 1);
        int bankAccNum = bankAccounts.length-1;
        bankAccounts[bankAccNum] = new BankAccount(bankAccNum, balance, customerName, email, phoneNum);
    }

    private static void printAllBankInfo()
    {
        int numAccs = bankAccounts.length;

        if(numAccs == 0)
            System.out.println("We have no accounts yet.");
        else if(numAccs == 1)
            System.out.println("We have 1 account in our bank, here it is.");
        else
            System.out.println("We have " + bankAccounts.length + " accounts in our bank, here they are in order of creation");

        for(BankAccount bankAccount : bankAccounts)
        {
            System.out.println("-------------------------------------------------------");
            bankAccount.printBankInfo();
        }
    }

    public static void main(String[] args)
    {
        createNewBankAccount(100, "Andreas Eriksson", "trashy94@gmail.com", "070-231155");
        printAllBankInfo();
    }
}
