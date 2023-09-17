import java.util.Scanner;

public class Lab8_1_64010792 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1 : ");
        double side1 = input.nextDouble();
        System.out.print("\nEnter side2 : ");
        double side2 = input.nextDouble();
        System.out.print("\nEnter side3 : ");
        double side3 = input.nextDouble();
        System.out.print("\nEnter color : ");
        String color = input.next();
        System.out.print("\nEnter filled : ");
        boolean filled = input.nextBoolean();
        input.close();
        if(side1 <= 0 || side2 <= 0 || side3 <= 0){
            System.out.print("Wrong number");
            System.exit(0);
        }
        Triangle triangle = new Triangle(color, filled, side1, side2, side3);
        System.out.println();
        System.out.println(triangle.toString());
        System.out.println("Area is " + triangle.getArea());
        System.out.println("Perimeter is " + triangle.getPerimeter());
        System.out.println("Color is " + triangle.getColor());
        System.out.println("Filled is " + triangle.isFilled());
    }
}
