import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Get array length
            System.out.print("Please enter array length :");
            int arrayLength = scanner.nextInt();

            int[] numbers = new int[arrayLength];

            // Get array values
            for (int i = 0; i < arrayLength; i++) {
                System.out.print("please enter index " + i + " value :");
                numbers[i] = scanner.nextInt();
            }

            int[] copyNumbers = new int[arrayLength];

            // Copy numbers in copyNumbers
            for (int i = 0; i < arrayLength; i++) {
                copyNumbers[i] = numbers[i];
            }

            // Result
            System.out.println("Original :");
            System.out.print("[ ");
            for (int number : numbers) {
                System.out.print(number + ",");
            }
            System.out.print(" ]");

            System.out.println();

            System.out.println("Copy :");
            System.out.print("[ ");
            for (int number : copyNumbers) {
                System.out.print(number + ",");
            }
            System.out.print(" ]");

        System.out.println("Program finished.");
        scanner.close();



    }
    }
