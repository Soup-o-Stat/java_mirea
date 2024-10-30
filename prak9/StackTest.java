import java.util.ArrayList;
import java.util.Scanner;

class GenericStack<E> {
    private E[] stackArray;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        capacity = 10;
        stackArray = (E[]) new Object[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[size - 1];
    }

    public void push(E o) {
        if (size == capacity) {
            expandCapacity();
        }
        stackArray[size++] = o;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        E topElement = stackArray[--size];
        stackArray[size] = null;
        return topElement;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder stackString = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            stackString.append(stackArray[i]);
            if (i < size - 1) {
                stackString.append(", ");
            }
        }
        stackString.append("]");
        return stackString.toString();
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        capacity *= 2;
        E[] newArray = (E[]) new Object[capacity];
        System.arraycopy(stackArray, 0, newArray, 0, size);
        stackArray = newArray;
    }
}

class GenericStackInheritance<E> extends ArrayList<E> {
    public int getSize() {
        return size();
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return get(getSize() - 1);
    }

    public void push(E o) {
        add(o);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return remove(getSize() - 1);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}

public class StackTest {
    public static void main(String[] args) {
        GenericStack<String> arrayStack = new GenericStack<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 15; i++) {
            arrayStack.push("Элемент " + i);
            System.out.println("Добавлен: Элемент " + i + " (Текущий размер стека: " + arrayStack.getSize() + ")");
        }

        GenericStackInheritance<String> inheritanceStack = new GenericStackInheritance<>();
        System.out.println("\nВведите 5 строк для стека на основе ArrayList:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            inheritanceStack.push(scanner.nextLine());
        }
        System.out.println("\nВывод строк в обратном порядке для стека на основе ArrayList:");
        while (!inheritanceStack.isEmpty()) {
            System.out.println(inheritanceStack.pop());
        }

        scanner.close();
    }
}
