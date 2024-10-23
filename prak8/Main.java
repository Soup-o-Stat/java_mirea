import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Created by Soup-o-Stat");
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");

            if (scanner.hasNextInt()) {
                int month = scanner.nextInt();

                try {
                    if (month == 2) {
                        System.out.println("You've selected February. Please enter a year:");
                        if (scanner.hasNextInt()) {
                            int year = scanner.nextInt();
                            if (isLeapYear(year)) {
                                System.out.println("Month: " + months[month - 1]);
                                System.out.println("Days: 29 (Leap year)");
                            } else {
                                System.out.println("Month: " + months[month - 1]);
                                System.out.println("Days: 28 (Not a leap year)");
                            }
                        } else {
                            System.out.println("Invalid input");
                            scanner.next();
                        }
                    } else {
                        System.out.println("Month: " + months[month - 1]);
                        System.out.println("Days: " + daysOfMonth[month - 1]);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid number");
                }
            } else {
                System.out.println("Invalid input");
                scanner.next();
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 !=
                0 || year % 400 == 0));
    }
}
