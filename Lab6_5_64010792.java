import java.util.Scanner;

public class Lab6_5_64010792 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475}, // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        System.out.println("Filing Status");
        System.out.println("    [0]-Single filer");
        System.out.println("    [1]-Married jointly or qualifying widow(er)");
        System.out.println("    [2]-Married separately");
        System.out.println("    [3]-Head of household");
        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
        if(status >= 0 && status <= 3){

        }
        else{
            System.out.println("error");
            System.exit(0);
        }
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        if(income < 0){
            System.out.println("error");
            System.exit(0);
        }
        Tax tax = new Tax(status, brackets, rates, income);
        System.out.println("Tax is " + tax.getTax());
    }
}
