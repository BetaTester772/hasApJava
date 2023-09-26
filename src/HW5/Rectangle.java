package HW5;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw() {
        System.out.println("Rectangle, " + this.toString());
    }

    public double calcArea() {
        return (float) width * (float) height;
    }

    public String toString() {
        return "(width: " + this.width + ", height: " + this.height + ", area: " + calcArea() + "), " + super.toString();
    }

}
