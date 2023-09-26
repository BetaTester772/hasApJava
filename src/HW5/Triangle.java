package HW5;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int x, int y) {
        super(x, y);
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw() {
        System.out.println("Triangle, " + this.toString());
    }

    public double calcArea() {
        return (float) base * (float) height / 2;
    }

    public String toString() {
        return "(base: " + this.base + ", height: " + this.height + ", area: " + calcArea() + "), " + super.toString();
    }

}
