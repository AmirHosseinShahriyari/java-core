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

        System.out.print("Please enter shit direction:");
        String direction = scanner.next().toLowerCase();

        if(!direction.equals("right") && !direction.equals("left")){
            System.out.println("Please enter a valid direction.");
            scanner.close();
            return;
        }


        System.out.print("Please enter number of shifts:");
        int k = scanner.nextInt();

        if (k < 0) {
            System.out.println("Number of shifts must be non-negative.");
            scanner.close();
            return;
        }

        if(direction.equals("right")) {
            for (int i = 0; i < k; i++) {
                for (int j = numbers.length - 1; j > 0; j--) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }
        else if(direction.equals("left")){
            for (int i = 0; i < k; i++){
                for (int j = 0; j < numbers.length - 1; j++){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }


        System.out.print("Result: [ ");
        for (int i = 0; i < numbers.length; i++){
            if(i == numbers.length - 1){
                System.out.print(numbers[i]);
            }else {
                System.out.print(numbers[i] + ",");
            }
        }
        System.out.print(" ]");
        System.out.println();

        System.out.println("Program finished.");
        scanner.close();
    }
}