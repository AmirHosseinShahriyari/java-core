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
            System.out.print("Please enter index " + i + " value :");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter target:");
        int target = scanner.nextInt();

        int count = 0;
        for (int number : numbers) {
            if (number != target) {
                count++;
            }
        }

        int[] newNumbers = new int[count];

        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != target) {
                newNumbers[j] = numbers[i];
                j++;
            }
        }

        System.out.print("Result: [ ");
        for (int i = 0; i < newNumbers.length; i++) {
            if (i == newNumbers.length - 1)
                System.out.print(newNumbers[i]);
            else
                System.out.print(newNumbers[i] + ", ");
        }
        System.out.print(" ]");
        System.out.println();

        System.out.println("Program finished.");
        scanner.close();
    }
}