public class Lab8_4_64010792 {
    public static void main(String[] args){
    Octagon o1 = new Octagon(5);
    System.out.println("Area of Octagon1 is " + o1.getArea());
    System.out.println("Perimeter of Octagon1 is " + o1.getPerimeter());
    try {
        Octagon o2 = (Octagon)o1.clone();
        if(o1.compareTo(o2) == 0) {
            System.out.println("Octagon1 is equal to Octagon2");
        } 
        else if(o1.compareTo(o2) == 1) {
            System.out.println("Octagon1 is greater than Octagon2");
        } 
        else{
            System.out.println("Octagon1 is less than Octagon2");
        }
    } 
    catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }
    }
}
