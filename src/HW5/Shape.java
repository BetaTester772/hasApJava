package HW5;

public class Shape {

    private int x;
    private int y;

    public Shape() {
        x = 0;
        y = 0;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Shape, " + this.toString());
    }

    public double calcArea() {
        return 0;
    }

    public String toString() {
        return "(x:" + this.x + ", y:" + this.y + ")";
    }

}

