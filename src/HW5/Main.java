package HW5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = init();
        drawAll(shapes);
    }

    public static Shape[] init() {


        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 도형의 개수 : ");
        int n = scanner.nextInt();

        Shape[] shapes = new Shape[n];

        for (int i = 0; i < n; i++) {

            System.out.print("1번 도형의 종류(1-사각/2-삼각/3-원): ");
            int type = scanner.nextInt();

            System.out.print("중심 X좌표: ");
            int x = scanner.nextInt();

            System.out.print("중심 Y좌표: ");
            int y = scanner.nextInt();

            if (type == 1) {
//                Rectangle
                System.out.print("가로 길이: ");
                int width = scanner.nextInt();

                System.out.print("세로 길이: ");
                int height = scanner.nextInt();

                Shape shape = new Rectangle(x, y);
                ((Rectangle) shape).setWidth(width);
                ((Rectangle) shape).setHeight(height);
                shapes[i] = shape;
            } else if (type == 2) {
//                Triangle
                System.out.print("밑변 길이: ");
                int base = scanner.nextInt();

                System.out.print("높이 길이: ");
                int height = scanner.nextInt();

                Shape shape = new Triangle(x, y);
                ((Triangle) shape).setBase(base);
                ((Triangle) shape).setHeight(height);
                shapes[i] = shape;
            } else if (type == 3) {
//                Circle
                System.out.print("반지름 길이: ");
                int radius = scanner.nextInt();

                Shape shape = new Circle(x, y);
                ((Circle) shape).setRadius(radius);
                shapes[i] = shape;
            }
        }
        return shapes;

    }

    public static void drawAll(Shape[] shapes) {
        for (Shape shape : shapes)
            shape.draw();
    }
}
