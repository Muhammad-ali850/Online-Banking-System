import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        String accnum; //Account Number Savings
        String accnum2; //Account Number Current
        double withdraw; //withdraw amount
        double deposit; //Deposit amount
        
        Scanner s = new Scanner(System.in);
        SavingsAccount obj1 = new SavingsAccount();
        CurrentAccount obj2 = new CurrentAccount();
        
        System.out.println("Press 1 for Savings Account or press 2 for Current Account");
        int num = s.nextInt();
        if(num==1){
        System.out.println("Enter account number of your Savings Account");
        accnum=s.next();
        if(accnum.equals("peter123") || accnum.equals("sam123") || accnum.equals("steve123") || accnum.equals("harry123") || accnum.equals("bruce123")){  //dummy database
            if(accnum.equals("peter123"))
            System.out.println("\nWelcome Peter");
            else if(accnum.equals("sam123"))
            System.out.println("\nWelcome Sam");
            else if(accnum.equals("steve123"))   //Dummy users
            System.out.println("\nWelcome Steve");
            else if(accnum.equals("harry123"))
            System.out.println("\nWelcome Harry");
            else if(accnum.equals("bruce123"))
            System.out.println("\nWelcome Bruce");
            
            System.out.println("*Savings Account*\nPress 1 to check your Balance\nPress 2 to withdraw\nPress 3 to deposit\nPress 4 to check balance with interest");
            int num2 = s.nextInt();
            switch (num2) {
                case 1:
                    obj1.setBalance(accnum);
                    obj1.checkBalance(accnum);
                    break;
                case 2:
                    obj1.setBalance(accnum);
                    System.out.println("How much you want to withdraw");
                    withdraw = s.nextDouble();
                    obj1.withdraw(withdraw);
                    break;
                case 3:
                    obj1.setBalance(accnum);
                    System.out.println("How much you want to deposit");
                    deposit = s.nextDouble();
                    obj1.deposit(deposit);
                    break;
                case 4:
                    obj1.setBalance(accnum);
                    obj1.calculateInterest();
                    break;
                default:
                    break;
            }

        }
        else{
            System.out.println("Wrong Account Number");
        }
    } 
    else{
        System.out.println("Enter account number of your Current Account");
        accnum2=s.next();
        if(accnum2.equals("peter321") || accnum2.equals("sam321") || accnum2.equals("steve321") || accnum2.equals("harry321") || accnum2.equals("bruce321")){  //dummy database
            if(accnum2.equals("peter321"))
            System.out.println("\nWelcome Peter");
            else if(accnum2.equals("sam321"))
            System.out.println("\nWelcome Sam");
            else if(accnum2.equals("steve321"))
            System.out.println("\nWelcome Steve");
            else if(accnum2.equals("harry321"))
            System.out.println("\nWelcome Harry");
            else if(accnum2.equals("bruce321"))
            System.out.println("\nWelcome Bruce");
            
            System.out.println("*Current Account*\nPress 1 to check your Balance\nPress 2 to withdraw\nPress 3 to deposit");
            int num2 = s.nextInt();
            switch (num2) {
                case 1:
                    obj2.setBalance(accnum2);
                    obj2.checkBalance(accnum2);
                    break;
                case 2:
                    obj2.setBalance(accnum2);
                    System.out.println("How much you want to withdraw");
                    withdraw = s.nextDouble();
                    obj2.withdraw(withdraw);
                    break;
                case 3:
                    obj2.setBalance(accnum2);
                    System.out.println("How much you want to deposit");
                    deposit = s.nextDouble();
                    obj2.deposit(deposit);
                    break;
                default:
                    break;
            }
        }
        else{
            System.out.println("Wrong Account Number");
        }
    }
    }
}