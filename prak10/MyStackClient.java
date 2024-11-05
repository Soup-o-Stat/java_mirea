import java.util.Scanner;

public class MyStackClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyStack stack = new MyStack();

        System.out.println("Введите пять строк:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            stack.push(input);
        }

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
