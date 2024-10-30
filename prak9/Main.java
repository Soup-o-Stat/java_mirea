import java.util.ArrayList;
import java.util.List;

class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}

public class Main {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> uniqueList = new ArrayList<>();
        for (T item : list) {
            if (!uniqueList.contains(item)) {
                uniqueList.add(item);
            }
        }
        return uniqueList;
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static Circle findLargestCircle(Circle[] circles) {
        if (circles == null || circles.length == 0) return null;

        Circle largest = circles[0];
        for (Circle circle : circles) {
            if (circle.compareTo(largest) > 0) {
                largest = circle;
            }
        }
        return largest;
    }

    public static Circle findLargestIn2DArray(Circle[][] circles) {
        if (circles == null || circles.length == 0) return null;

        Circle largest = null;
        for (Circle[] row : circles) {
            for (Circle circle : row) {
                if (largest == null || (circle != null && circle.compareTo(largest) > 0)) {
                    largest = circle;
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println("Task 1.1");
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 2, 4, 1));
        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Уникальные элементы: " + uniqueNumbers);

        System.out.println("Task 1.2");
        int[] array = {5, 3, 8, 4, 9};
        int target = 8;
        int position = linearSearch(array, target);
        System.out.println("Позиция элемента " + target + ": " + position);

        System.out.println("Task 1.3");
        Circle[] circleArray = {new Circle(2.5), new Circle(3.5), new Circle(1.5)};
        Circle largestCircle = findLargestCircle(circleArray);
        System.out.println("Наибольший круг: " + largestCircle);

        System.out.println("Task 1.4");
        Circle[][] circleMatrix = {
                {new Circle(2.5), new Circle(3.5), new Circle(1.5)},
                {new Circle(4.0), new Circle(0.5), new Circle(2.0)}
        };
        Circle largestInMatrix = findLargestIn2DArray(circleMatrix);
        System.out.println("Наибольший круг в матрице: " + largestInMatrix);
    }
}
