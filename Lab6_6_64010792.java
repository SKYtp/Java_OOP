import java.util.Scanner;

public class Lab6_6_64010792 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;
        int choice;
        double withdraw = 0;
        ATM[] atm = new ATM[10];
        for(int i = 0;i<10;i++){
            atm[i] = new ATM();
        }
        while(true){
            System.out.print("Enter an id: ");
            id = input.nextInt();
            System.out.println("");
            if(id >= 0 && id <= 9){
                while(true){
                    System.out.println("Main menu");
                    System.out.println("1: check balance");
                    System.out.println("2: withdraw");
                    System.out.println("3: deposit");
                    System.out.println("4: exit");
                    System.out.print("Enter a choice: ");
                    choice = input.nextInt();
                    if(choice == 1){
                        System.out.printf("The balance is %.2f \n",atm[id].getbalance()); 
                    }
                    else if(choice == 2){
                        System.out.print("Enter an amount to withdraw: ");
                        withdraw = input.nextDouble();
                        if(atm[id].getbalance() >= withdraw){
                            atm[id].withdraw(withdraw);
                        }
                        else{
                            System.out.println("Not enough balance"); 
                        }
                    }
                    else if(choice == 3){
                        System.out.print("Enter an amount to deposit: ");
                        atm[id].deposit(input.nextDouble());
                    }
                    else if(choice == 4){
                        break;
                    }
                    else{
                        System.out.println("Wrong number"); 
                    }
                    System.out.println(""); 
                }
            }
            else{
                System.out.println("Wrong id"); 
            }
            System.out.println("----------------------------------");
        }
    }
}
class ATM{
    private double balance = 100;
    ATM(){

    }
    public double getbalance(){
        return balance;
    }
    public void withdraw(double with){
        balance = balance - with;
    }
    public void deposit(Double de){
        balance = balance + de;
    }
}
