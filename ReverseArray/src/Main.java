import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter array length:");
        int arrayLength = scanner.nextInt();

        if (arrayLength <= 0) {
            System.out.println("Array length must be greater than 0");
            scanner.close();
            return;
        }

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter index " + i + " value:");
            numbers[i] = scanner.nextInt();
        }

        int left = 0;
        int right = arrayLength - 1;
        while (left < right){
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
                left++;
                right--;
            }

        System.out.print("Result: [ ");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1)
                System.out.print(numbers[i]);
            else
                System.out.print(numbers[i] + ", ");
        }
        System.out.print(" ]");
        System.out.println();

        System.out.println("Program finished.");
        scanner.close();
    }
}
