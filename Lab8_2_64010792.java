public class Lab8_2_64010792 {
    public static void main(String[] args) {
        Square[] square = new Square[5];
        square[0] = new Square("red",true,15);
        square[1] = new Square("blue",true,6);
        square[2] = new Square("yellow",true,3);
        square[3] = new Square("black",true,10);
        square[4] = new Square(8);
        for(int i = 0;i<5;i++){
            System.out.println("Area of square"+(i+1)+" is "+square[i].getArea());
            square[i].howToColor();
            System.out.println();
            System.out.println("-----------------");
        }
    }
}
