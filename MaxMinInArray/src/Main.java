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

            // Max and Min calculation
            int max = numbers[0];
            int min = numbers[0];
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
            // Result
            System.out.println("max :" + max);
            System.out.println("min :" + min);

            System.out.println("Program finished.");
            scanner.close();
    }
    }
