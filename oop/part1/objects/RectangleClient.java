package oop.part1.objects;

public class RectangleClient {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("Прямоугольник 1:\n" + "Ширина = " + rect1.width + "\nВысота = " + rect1.height + "\nПлощадь = " + rect1.getArea() + "\nПериметр = " + rect1.getPerimeter());
        System.out.println("\nПрямоугольник 2:\n" + "Ширина = " + rect2.width + "\nВысота = " + rect2.height + "\nПлощадь = " + rect2.getArea() + "\nПериметр = " + rect2.getPerimeter());
    }
}
