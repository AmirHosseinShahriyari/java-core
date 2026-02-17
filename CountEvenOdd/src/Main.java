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

        for (int i = 0; i < arrayLength; i++){
            if(numbers[i] % 2 == 0){
                System.out.println("even :" + numbers[i]);
            }else{
                System.out.println("odd :" + numbers[i]);
            }
        }
    }
}