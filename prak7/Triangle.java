import java.lang.Math;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled)
            throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Недопустимые стороны: сумма любых двух сторон должна быть больше третьей.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        double area= Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        double scale = Math.pow(10, 2);
        double result = Math.ceil(area * scale) / scale;
        return result;
    }

    @Override
    public String toString() {
        return "Треугольник создан:\n" +
                "Сторона 1: " + side1 + "\n" +
                "Сторона 2: " + side2 + "\n" +
                "Сторона 3: " + side3 + "\n" +
                "Периметр: " + getPerimeter() + "\n" +
                "Площадь: " + getArea() + "\n" +
                "Цвет: " + getColor() + "\n" +
                "Заливка: " + (isFilled() ? "да" : "нет") + "\n" +
                "Дата создания: " + getDateCreated();
    }

//    @Override
//    public void howToColor() {
//
//    }
}
