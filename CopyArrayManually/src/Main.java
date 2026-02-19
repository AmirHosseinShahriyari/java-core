import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter array length:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array length must be greater than 0.");
            scanner.close();
            return;
        }

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter index " + i + " value:");
            numbers[i] = scanner.nextInt();
        }

        int[] copyNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }

        System.out.println();
        System.out.println("Original:");
        System.out.print("[ ");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1)
                System.out.print(numbers[i]);
            else
                System.out.print(numbers[i] + ", ");
        }
        System.out.print(" ]");
        System.out.println();

        System.out.println();

        System.out.println("Copy:");
        System.out.print("[ ");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1)
                System.out.print(copyNumbers[i]);
            else
                System.out.print(copyNumbers[i] + ", ");
        }
        System.out.print(" ]");
        System.out.println();

        System.out.println("Program finished.");
        scanner.close();
    }


}
