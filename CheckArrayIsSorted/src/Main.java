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

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] > numbers[i + 1]){
                ascending = false;
            }else if(numbers[i] < numbers[i + 1]){
                descending = false;
            }
        }

        boolean isSorted = ascending || descending;

        if(isSorted){
            System.out.println("Your array is sorted.");
        }else{
            System.out.println("Your array is not sorted");
        }

        System.out.println("Program finished.");
        scanner.close();
    }
}