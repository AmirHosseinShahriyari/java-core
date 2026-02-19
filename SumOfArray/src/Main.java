import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter array length :");
        int arrayLength = scanner.nextInt();

        if (arrayLength <= 0) {
            System.out.println("Array length must be greater than 0");
            scanner.close();
            return;
        }


        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter index " + i + " value :");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
        System.out.println();

        System.out.println("Program finished.");
        scanner.close();

    }
}
