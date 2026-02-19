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



        for (int i = 0; i < numbers.length - 1; i++){

            boolean seenBefore = false;

            for (int k = 0; k < i; k++) {
                if (numbers[k] == numbers[i]) {
                    seenBefore = true;
                    break;
                }
            }

            if (seenBefore) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                }
            }
                System.out.println(numbers[i] + "(" + count +")");
        }

        System.out.println("Program finished.");
        scanner.close();
    }
}