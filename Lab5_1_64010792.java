public class Lab5_1_64010792 {
    public static void main(String[] args) {
        System.out.println((2%3) + 1);
        Account account = new Account(1122,20000);
        //account.editAccount(1122, 20000, 4.5);
        account.editAnnual(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("ID : " + account.getId());
        System.out.println("Balance : " + account.getBalance());
        System.out.println("Monthly interest : " + account.getMonthlyInterest());
        System.out.println("Account created : " + account.getDate());
    }
}
