public class SavingsAccount extends Account{
    double interestRate = 2.5; //% per annum. Could be different value

    public void setBalance(String a){ //dummy balance
     if(a.equals("peter123"))
         setBalance(70000);
         else if(a.equals("sam123"))
         setBalance(50000);
         else if(a.equals("steve123"))
         setBalance(760000);
         else if(a.equals("harry123"))
         setBalance(30000);
         else if(a.equals("bruce123"))
         setBalance(45000);
    }

    public void calculateInterest(){
        double rate = getBalance() * (interestRate/100);
        System.out.println("With interest (2.5% per annum) your balance: " + ((getBalance() + rate)));
    }

    public void withdraw(double amount){
        if (amount > getBalance()) {
           System.out.println("Insufficient balance.");
       } else {
           double newBalance = this.getBalance() - amount;
           setBalance(newBalance);
           System.out.println("After withdrawing, your new balance: " + this.getBalance());
       }
       }

       public void checkBalance(String a){ //Dummy users. Could be more users
        if(a.equals("peter123"))
        System.out.println("Your Balance: " + getBalance());
        else if(a.equals("sam123"))
        System.out.println("Your Balance: " + getBalance());
        else if(a.equals("steve123"))
        System.out.println("Your Balance: " + getBalance());
        else if(a.equals("harry123"))
        System.out.println("Your Balance: " + getBalance());
        else if(a.equals("bruce123"))
        System.out.println("Your Balance: " + getBalance());
    }
}