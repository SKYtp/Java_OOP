public class CheckingAccount extends Account {
    public double overdraft = -500;
    private double balancek;
    CheckingAccount(){
        super();
    }
    CheckingAccount(double balance,double overdraft ,double annualInterestRate){
        super();
        setBalance(balance);
        balancek = balance;
        this.overdraft = overdraft * -1;
        editAnnual(annualInterestRate);
    }
    public void withdraw(double withdraws){
        double keep = getBalance();
        super.c = 1;
        super.keepW = withdraws;
        super.balanceB = getBalance();
        balancek = getBalance();
        if(getBalance() - withdraws >= overdraft && withdraws >= 0){
            super.withdraw(withdraws);
            //System.out.println("Withdraw: " + withdraws);
        }
        else{
            System.out.println("\nOut of limit or Error");
        }
    }
    public double getOverdraft(){
        return overdraft * -1;
    }
    public void setOverdraft(double overdraft){
        this.overdraft = overdraft * -1;
    }
    public String toString(){
        if(super.c == 2){
            return "\nCheckingAccount" +"\nOverdraft Limit: " +(overdraft * -1)+ "\nBalance is: " + super.balanceB + "\nDeposit: " + super.keepW + "\nBalance is: " + getBalance() + "\nThis account was created at " + super.dateCreated;
        }
        return "\nCheckingAccount" +"\nOverdraft Limit: "+(overdraft * -1)+ "\nBalance is: " + super.balanceB + "\nWithdraw: " + super.keepW + "\nBalance is: " + getBalance() + "\nThis account was created at " + super.dateCreated;
    }
}
