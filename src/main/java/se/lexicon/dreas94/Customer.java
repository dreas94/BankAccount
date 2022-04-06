package se.lexicon.dreas94;

public class Customer
{
    private String name;
    private String email;
    private String phoneNum;

    public Customer(String name, String email, String phoneNum)
    {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public void printCustomerInfo()
    {
        System.out.println("Customer: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNum);
    }

    public String GetCustomerName()
    {
        return name;
    }
    public void SetCustomerName(String customerName)
    {
        this.name = customerName;
    }
    public String GetEmail()
    {
        return email;
    }
    public void SetEmail(String email)
    {
        this.email = email;
    }
    public String GetPhoneNum()
    {
        return phoneNum;
    }
    public void SetPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }
}
