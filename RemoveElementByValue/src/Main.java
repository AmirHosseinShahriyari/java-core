import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array length
        System.out.print("Please enter array length :");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        // Get array values
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("please enter index " + i + " value :");
            numbers[i] = scanner.nextInt();
        }

        // Get target
        System.out.print("Enter target :");
        int target = scanner.nextInt();

        int count = 0;
        for (int number : numbers){
            if(number != target){
                count++;
            }
        }

        int[] newNumbers = new int[count];

        int j = 0;
        for (int i = 0; i < arrayLength; i++){
            if(numbers[i] != target){
                newNumbers[j] = numbers[i];
                j++;
            }
        }

        // Result
        System.out.print("Result [ ");
        for (int number : newNumbers){
            System.out.print(number + ",");
        }
        System.out.print(" ]");
    }
}