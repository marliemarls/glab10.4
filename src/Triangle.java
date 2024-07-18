public class Triangle extends Shape implements Moveable{
    public Triangle(String color){
        super.color = color;
    }

    public void setBase(int base){
        this.base = base;
    }

    public double getArea(){
        return 0.5 * super.base * super.height;
    }

    @Override
    public void displayshapName() {
        System.out.println("I am a Triangle");
    }

    @Override
    public String toString() {
        return "Triangle [base = " + super.base + ", height = " + super.height + "," + super.toString() + "]";
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public String getCoordinate() {
        return "";
    }
}
