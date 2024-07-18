public class Rectangle extends Shape implements Moveable{

    public Rectangle(String color, double width, double height){
        super.height = height;
        super.width = width;
        super.color = color;
    }

    @Override
    public double getArea() {
        return super.width * super.height;
    }

    @Override
    public String toString(){
        return "Rectangle[height = " + height + ", width = " + width + "," + super.toString() + "]";
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
