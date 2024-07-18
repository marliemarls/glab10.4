public class Circle extends Shape implements Moveable {
    protected double radius;
    private int x, y;
    private final double PI = Math.PI;

    public Circle(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, double height){
        this.radius = radius;
        super.height = height;
    }

    @Override
    public double getArea() {
        double area = PI * Math.pow(this.radius, 2);
        return area;
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "] ";
    }

    public String getCoordinate(){
        return "(" + x + "," + y + ")";
    }

    public void moveUp(){
        y++;
    }

    public void moveDown(){
        y--;
    }

    public void moveLeft(){
        x--;
    }

    public void moveRight(){
        x++;
    }


}
