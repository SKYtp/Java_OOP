import java.util.Scanner;

public class Lab6_4_64010792 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475}, // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        double tax = 0;
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
        //------------------------------------------------ 
        // tax = brackets[0][0] * rates[0] +
        // (brackets[0][1] - brackets[0][0]) * rates[1] +
        // (brackets[0][2] - brackets[0][1]) * rates[2] +
        // (brackets[0][3] - brackets[0][2]) * rates[3] +
        // (brackets[0][4] - brackets[0][3]) * rates[4] +
        // (400000 - brackets[0][4]) * rates[5];
        if(income >= brackets[status][0]){ //1
            tax += (brackets[status][0] * rates[0]);
        }
        if(income >= brackets[status][0]){ //2
            if(income >= brackets[status][0] && income < brackets[status][1]){
                tax += (income - brackets[status][0]) * rates[1];
            }
            else{
                tax += (brackets[status][1] - brackets[status][0]) * rates[1];
            }
        }
        if(income >= brackets[status][1]){ //3
            if(income >= brackets[status][1] && income < brackets[status][2]){
                tax += (income - brackets[status][1]) * rates[2];
            }
            else{
                tax += (brackets[status][2] - brackets[status][1]) * rates[2];
            }
        }
        if(income >= brackets[status][2]){ //4
            if(income >= brackets[status][2] && income < brackets[status][3]){
                tax += (income - brackets[status][2]) * rates[3];
            }
            else{
                tax += (brackets[status][3] - brackets[status][2]) * rates[3];
            }
        }
        if(income >= brackets[status][3]){ //5
            if(income >= brackets[status][3] && income < brackets[status][4]){
                tax += (income - brackets[status][3]) * rates[3];
            }
            else{
                tax += (brackets[status][4] - brackets[status][3]) * rates[4];
            }
        }
        if(income >= brackets[status][4]){ //6
            tax += (income - brackets[status][4]) * rates[5];
        }
        System.out.println("Tax is " + tax);
    }
}
