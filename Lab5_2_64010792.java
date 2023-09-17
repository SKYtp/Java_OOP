public class Lab5_2_64010792 {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("RegularPolygon 1");
        System.out.printf("Number of sides is %d \n",rp1.getN());
        System.out.printf("Length of the side is %.2f \n",rp1.getSide());
        System.out.printf("The x-coordinate is %.2f \n",rp1.getX());
        System.out.printf("The y-coordinate is %.2f \n",rp1.getY());
        System.out.println("Perimeter is " + rp1.getPerimeter());
        System.out.printf("Area is %.2f \n",rp1.getArea());
        System.out.println(" ");
        //end of RegularPolygon 1
        System.out.println("RegularPolygon 2");
        System.out.printf("Number of sides is %d \n",rp2.getN());
        System.out.printf("Length of the side is %.2f \n",rp2.getSide());
        System.out.printf("The x-coordinate is %.2f \n",rp2.getX());
        System.out.printf("The y-coordinate is %.2f \n",rp2.getY());
        System.out.println("Perimeter is " + rp2.getPerimeter());
        System.out.printf("Area is %.2f \n",rp2.getArea());
        System.out.println(" ");
        //end of RegularPolygon 2
        System.out.println("RegularPolygon 3");
        System.out.printf("Number of sides is %d \n",rp3.getN());
        System.out.printf("Length of the side is %.2f \n",rp3.getSide());
        System.out.printf("The x-coordinate is %.2f \n",rp3.getX());
        System.out.printf("The y-coordinate is %.2f \n",rp3.getY());
        System.out.println("Perimeter is " + rp3.getPerimeter());
        System.out.printf("Area is %.2f",rp3.getArea());
        System.out.println(" ");
        //end of RegularPolygon 3
    }
}
