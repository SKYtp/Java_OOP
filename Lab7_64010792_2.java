public class Lab7_64010792_2 {
    public static void main(String[] args) {
        NewAccount account = new NewAccount("George",1122,1000);
        account.editAnnual(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);
        System.out.println("Name: " + account.getname());
        System.out.println("Account ID: "+account.getId());
        System.out.println("Annual interest rate: " + account.getAnnual());
        System.out.println("Balance: "+account.getBalance());
        System.out.println("Date                            Type     Amount   Balance");
        account.printTransaction();
    }
}
