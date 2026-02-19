import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please select your array type =>");
        System.out.println("1.Int");
        System.out.println("2.String");

        char arrayType = scanner.next().charAt(0);

        if (arrayType == '1' || arrayType == '2') {

            System.out.print("Please enter your array length:");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Array length must be greater than 0");
                scanner.close();
                return;
            }


            if (arrayType == '1') {

                int[] numbers = new int[n];

                for (int i = 0; i < numbers.length; i++) {
                    System.out.print("Please enter array " + i + " value :");
                    numbers[i] = scanner.nextInt();
                }

                System.out.print("Result :");
                System.out.print("[ ");
                for (int i = 0; i < numbers.length; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.print(" ]");
                System.out.println();

            } else {
                String[] words = new String[n];

                for (int i = 0; i < words.length; i++) {
                    System.out.print("Please enter array " + i + " value :");
                    words[i] = scanner.next();
                }

                System.out.print("Result :");
                System.out.print("[ ");
                for (int i = 0; i < words.length; i++) {
                    System.out.print(words[i] + " ");
                }
                System.out.print(" ]");
                System.out.println();
            }
        } else {
            System.out.println("Please enter your type correctly");
        }

        System.out.println("Program finished.");
        scanner.close();
    }
}
