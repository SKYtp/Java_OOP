public class SavingsAccount extends Account {
    SavingsAccount(){
        super();

    }
    SavingsAccount(double balance,double annualInterestRate){
        super();
        setBalance(balance);
        editAnnual(annualInterestRate);
    }
    public void withdraw(double withdraws){
        double keep = getBalance();
        super.keepW = withdraws;
        super.balanceB = getBalance();
        if(getBalance() >= withdraws && withdraws >= 0){
            super.withdraw(withdraws);
            //setBalance(keep - withdraws);
            //System.out.println("Withdraw: " + withdraws);
        }
        else{
            System.out.println("\nOut of limit or Error");
        }
    }
    public String toString(){
        if(super.c == 2){
            return "\nSavingsAccount" +"\nNo limit"+ "\nBalance is: " + super.balanceB + "\nDeposit: " + super.keepW + "\nBalance is: " + getBalance() + "\nThis account was created at " + super.dateCreated;
        }
        return "\nSavingsAccount" +"\nNo limit " + "\nBalance is: " + super.balanceB + "\nWithdraw: " + super.keepW + "\nBalance is: " + getBalance() + "\nThis account was created at " + super.dateCreated;
    }
}
