import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter array 1 length :");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array length most be greater than 0");
            scanner.close();
            return;
        }

        int[] numbers1 = new int[n];


        System.out.print("Please enter array 2 length :");
        n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array length most be greater than 0");
            scanner.close();
            return;
        }

        int[] numbers2 = new int[n];


        System.out.println("Please enter array 1 values =>");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print("Please enter index " + i + " value:");
            numbers1[i] = scanner.nextInt();
        }


        System.out.println("Please enter array 2 values =>");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print("Please enter index " + i + " value:");
            numbers2[i] = scanner.nextInt();
        }

        int sum = 0;

        for(int number : numbers1){
            sum += number;
        }

        for(int number : numbers2){
            sum += number;
        }

        System.out.println("Sum: " + sum);
        System.out.println();

        System.out.println("Program finished.");
    }
}