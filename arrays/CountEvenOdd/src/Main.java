import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter array length:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array length must be greater than 0");
            scanner.close();
            return;
        }

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter index " + i + " value:");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Even: " + numbers[i]);
            } else {
                System.out.println("Odd: " + numbers[i]);
            }
        }
        System.out.println("Program finished.");
        scanner.close();
    }
}
