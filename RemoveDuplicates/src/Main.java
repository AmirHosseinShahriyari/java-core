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

        System.out.print("Result: [ ");
        for (int i = 0; i < numbers.length - 1; i++){
            boolean seenBefore = false;
            for (int k = i - 1; k >= 0; k--){
                if(numbers[i] == numbers[k]){
                    seenBefore = true;
                }
            }
            for (int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    seenBefore = true;
                }
            }
            if(!seenBefore){
                System.out.print(numbers[i]);
            }
        }
        System.out.print(" ]");
        System.out.println();

        System.out.println("Program finished.");
        scanner.close();
    }
}