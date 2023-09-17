public class Lab8_3_64010792 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 4);
        Rectangle rectangle2 = new Rectangle(5, 6);
        int c = rectangle1.compareTo(rectangle2);
        System.out.println("Area of rectangle1 is " + rectangle1.getArea());
        System.out.println("Area of rectangle2 is " + rectangle2.getArea());
        if(rectangle1.equals(rectangle2)){
            System.out.println("rectangle1 is equal to rectangle2");
        }
        if(c == 0) {
            System.out.println("rectangle1 is equal to rectangle2");
        } 
        else if(c == 1) {
            System.out.println("rectangle1 is greater than rectangle2");
        } 
        else{
            System.out.println("rectangle1 is less than rectangle2");
        }
    }
}
