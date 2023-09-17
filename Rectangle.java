public class Rectangle extends GeometricObject implements Comparable {
    private double width;
    private double height;
    public Rectangle(){
        super();
    }
    public Rectangle(double width,double height){
        super();
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color,boolean filled,double width,double height){
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return (width*height);
    }
    public double getPerimeter(){
        return (width + height) * 2;
    }
    public boolean equals(Object o){
        if(getArea() == ((Rectangle) o).getArea()){
            return true;
        }
        return false;
    }
    public int compareTo(Object o){
        // 1 = more than
        // -1 = less than
        // 0 = equal
        if(getArea() > ((Rectangle) o).getArea()){
            return 1;
        }
        else if(getArea() < ((Rectangle) o).getArea()){
            return -1;
        }
        return 0;
    }
}
