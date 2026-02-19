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

        System.out.print("Please enter target:");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                }
            }
        }

        if(!found){
            System.out.println("No two numbers sum up to the target.");
        }

        System.out.println();

        System.out.println("Program finished.");
        scanner.close();
    }
}