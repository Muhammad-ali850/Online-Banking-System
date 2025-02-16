public abstract class Account{
    private String accnum;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccnum() {
        return accnum;
    }

    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public void deposit(double amount){
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        System.out.println("After depositing your new balance: " + getBalance());
    }

    public abstract void withdraw(double amount);
    public abstract void checkBalance(String a);
}