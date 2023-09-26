package HW5;

public class Circle extends Shape {
    private int radius;
    private double PI = 3.14;

    public Circle(int x, int y) {
        super(x, y);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public void draw() {
        System.out.println("Circle, " + this.toString());
    }

    public double calcArea() {
        return (float) PI * (float) radius * (float) radius;
    }

    // toString 완성(단, super와 this 키워드 반드시 사용할 것)
    public String toString() {
        return "(radius: " + this.radius + ", area: " + calcArea() + "), " + super.toString();
    }

}
