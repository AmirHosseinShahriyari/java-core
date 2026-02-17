import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            // Get array length
            System.out.print("please enter array length :");
            int arrayLength = scanner.nextInt();


            int[] numbers = new int[arrayLength];

            // Get array values
            for (int i = 0; i < arrayLength; i++) {
                System.out.print("please enter index " + i + " value :");
                numbers[i] = scanner.nextInt();
            }

            // Calculating the sum of arrays
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            // Result
            System.out.println("sum :" + sum);
        System.out.println("Program finished.");
        scanner.close();

        }
    }
