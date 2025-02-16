public class CurrentAccount extends Account{
    double overdraftLimit = 5000; //could be different value
    
    public void setBalance(String a){ //dummy balance 
        if(a.equals("peter321"))
            setBalance(70000);
            else if(a.equals("sam321"))
            setBalance(50000);
            else if(a.equals("steve321"))
            setBalance(760000);
            else if(a.equals("harry321"))
            setBalance(30000);
            else if(a.equals("bruce321"))
            setBalance(45000);
       }

    public void withdraw(double amount){
        if(amount <= (getBalance() + overdraftLimit)){
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
            System.out.println("After withdrawing, your new balance: " + getBalance());
        }
        else{
            System.out.println("Your withdrawal amount is exceeding the overdraft limit");
        }
    }

    public void checkBalance(String a){ //Dummy users. Could be more users
        if(a.equals("peter321"))
        System.out.println("Your Balance: " + getBalance());
        else if(a.equals("sam321"))
        System.out.println("Your Balance: " + getBalance());
        else if(a.equals("steve321"))
        System.out.println("Your Balance: " + getBalance());
        else if(a.equals("harry321"))
        System.out.println("Your Balance: " + getBalance());
        else if(a.equals("bruce321"))
        System.out.println("Your Balance: " + getBalance());
    }
}