public class Square extends GeometricObject implements Colorable {
    private double width = 1;
    public Square(){
        super();
    }
    public Square(double width){
        super();
        this.width = width;
    }
    public Square(String color,boolean filled,double width){
        super(color,filled);
        this.width = width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }

    @Override
    public double getArea() {
        return (width * width);
    }
    public double getPerimeter(){
        return (width + width) * 2;
    }
    public void howToColor(){
        
            System.out.println("Color all four sides is " + getColor());

    }
}
