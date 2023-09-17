public class Octagon extends GeometricObject implements Comparable,Cloneable {
    private double side = 1;
    public Octagon(){
        super();
    }
    public Octagon(double side){
        super();
        this.side = side;
    }
    public Octagon(String color,boolean filled,double side){
        super(color,filled);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public Object clone()throws CloneNotSupportedException{  
        return (Octagon)super.clone();
    }
    public int compareTo(Object o){
        // 1 = more than
        // -1 = less than
        // 0 = equal
        if(getArea() > ((Octagon) o).getArea()){
            return 1;
        }
        else if(getArea() < ((Octagon) o).getArea()){
            return -1;
        }
        return 0;
    }
    public double getArea(){
        //return (2 + 4/22) * side * side;
        return (2 + 4/Math.sqrt(2)) * side * side;
    }
    public double getPerimeter(){
        return (side * 8);
    }
    public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter();
	}
}
