import java.util.Scanner;

public class Lab6_1_64010792 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = input.nextLine();
        System.out.print("Enter age : ");
        int age = input.nextInt();
        if(age <= 0){
            System.out.println("error");
            System.exit(0);
        }
        System.out.print("Enter weight in pounds : ");
        double weight = input.nextDouble();
        if(weight <= 0){
            System.out.println("error");
            System.exit(0);
        }
        System.out.print("Enter height in inches : ");
        double height = input.nextDouble();
        if(height <= 0){
            System.out.println("error");
            System.exit(0);
        }
        BMI bmi = new BMI(name, age, weight, height);
        System.out.println("-----------------------------");
        System.out.println("BMI is " + bmi.getBMI());
        System.out.println("The interpretation is " + bmi.getStatus());
    }
}
