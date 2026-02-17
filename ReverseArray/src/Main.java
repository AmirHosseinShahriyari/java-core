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

            // Reversing the array
            int left = 0;
            int right = arrayLength - 1;
            for (int i = 0; i < arrayLength; i++) {
                if (right > left) {
                    int temp = numbers[left];
                    numbers[left] = numbers[right];
                    numbers[right] = temp;
                    left++;
                    right--;
                }
            }

            // Result
            System.out.print("Result : [ ");
            for (int number : numbers) {
                System.out.print(number + ",");
            }
            System.out.print("]");
            System.out.println("Program finished.");
            scanner.close();
    }
    }
