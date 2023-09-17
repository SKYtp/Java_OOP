import java.util.Scanner;

public class Pro4_64010792 {
    public static void main(String[] args) {
        System.out.print("Enter weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        System.out.printf("\nEnter height in inches: ");
        double high = input.nextDouble();
        final double kg = 0.45359237; // 1 pound is 0.45359237 kilograms
        final double m = 0.0254; // 1 inch is 0.0254 meters
        if(weight <= 0 || high <= 0){
            System.out.printf("\nYou fill wrong number");
        }
        else{
            weight = weight * kg;
            high = high * m; 
            double result = (weight)/(high * high);
            System.out.printf("\nBMI is %.4f",result);
        } 
    }
}
