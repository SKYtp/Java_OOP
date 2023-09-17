public class Lab7_64010792_1 {
    public static void main(String[] args) {
        // CheckingAccount c = new CheckingAccount(5000,5000,1.5);
        // System.out.println("Checking Account");
        // System.out.println("Overdraft Limit: " + c.getOverdraft());
        // System.out.println("Balance is " + c.getBalance());
        // c.withdraw(10000);
        // System.out.println("Balance is " + c.getBalance());
        // System.out.println("This account was created at " + c.getDate());
        // System.out.println();
        Account account = new Account(5000,1.5);
        account.withdraw(10000);
        System.out.println(account.toString());

        CheckingAccount check = new CheckingAccount(5000, 5000, 1.5);
        check.withdraw(10000);
        System.out.println(check.toString());

        SavingsAccount save = new SavingsAccount(5000, 1.5);
        save.withdraw(10000);
        System.out.println(save.toString());    
    }
}
