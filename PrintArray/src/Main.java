import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            // Select array type
            System.out.println("Please select your array type :");
            System.out.println("1.Int");
            System.out.println("2.String");
            System.out.println("enter E to exit");

            char arrayType = scanner.next().charAt(0);

            // Input check
            if(arrayType == '1' || arrayType == '2'){

            // Get array length
            System.out.print("Please enter your array length :");
            int arrayLength = scanner.nextInt();

            // Get array value and print
            if (arrayType == '1') {

                int[] numbers = new int[arrayLength];

                for (int i = 0; i < arrayLength; i++){
                    System.out.print("please enter array " + i + " value :");
                    numbers[i] = scanner.nextInt();
                }

                System.out.print("Result :");
                System.out.print("[ ");

                for (int i = 0; i < arrayLength; i++){
                    System.out.print(numbers[i] + " ");
                }

                System.out.print(" ]");
                System.out.println();

            }
            else{
                String[] words = new String[arrayLength];
                for (int i = 0; i < arrayLength; i++){
                    System.out.print("please enter array " + i + " value :");
                    words[i] = scanner.next();
                }
                System.out.print("Result :");
                System.out.print("[ ");
                for (int i = 0; i < arrayLength; i++){
                    System.out.print(words[i] + " ");
                }
                System.out.print(" ]");
                System.out.println();
            }
            }
            else if(arrayType == 'E'){
                break;
            }
            else {
                System.out.println("please enter your type correctly");
            }
        }
    }
}
