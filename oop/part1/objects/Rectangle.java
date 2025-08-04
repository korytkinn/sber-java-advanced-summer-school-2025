package oop.part1.objects;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        width = -1.0;
        height = -1.0;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
}