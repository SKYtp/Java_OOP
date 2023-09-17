public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    
    RegularPolygon(){

    }
    RegularPolygon(int newN , double newSide){
        n = newN;
        side = newSide;
    }
    RegularPolygon(int newN , double newSide,double newX, double newY){
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }
    public void editN(int newN){
        n = newN;
    }
    public int getN(){
        return this.n;
    }
    public void editSide(double newSide){
        side =  newSide;
    }
    public double getSide(){
        return this.side;
    }
    public void editX(double newX){
        x = newX;
    }
    public double getX(){
        return this.x;
    }
    public void editY(double newY){
        x = newY;
    }
    public double getY(){
        return this.y;
    }
    public double getPerimeter(){
        return n * side;
    }
    public double getArea(){
        return (n * (side * side))/(4 * Math.tan(Math.PI/n));
    }
}