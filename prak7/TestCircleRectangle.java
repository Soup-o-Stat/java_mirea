import java.util.Scanner;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите стороны треугольника:");
            System.out.print("Сторона 1: ");
            double side1 = scanner.nextDouble();
            System.out.print("Сторона 2: ");
            double side2 = scanner.nextDouble();
            System.out.print("Сторона 3: ");
            double side3 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Введите цвет треугольника: ");
            String color = scanner.nextLine();
            System.out.print("Заливка (true/false): ");
            boolean filled = scanner.nextBoolean();

            Triangle triangle = new Triangle(side1, side2, side3, color, filled);
            System.out.println("Созданный треугольник:");
            System.out.println(triangle);

            Circle circle1 = new Circle(5, "Красный", true);
            Circle circle2 = new Circle(3, "Синий", false);
            System.out.println("Наибольший круг: " + GeometricObject.max(circle1, circle2));

            System.out.print("\nВведите сторону квадрата: ");
            double side = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Введите цвет квадрата: ");
            color = scanner.nextLine();
            System.out.print("Заливка (true/false): ");
            filled = scanner.nextBoolean();

            Square square = new Square(side, color, filled);
            System.out.println("Созданный квадрат:");
            System.out.println(square);
            square.howtocolor();

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
