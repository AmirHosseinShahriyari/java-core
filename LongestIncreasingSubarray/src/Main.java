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

        int currentLength = 1;
        int maxLength = 1;
        int endIndex = 0;

        for (int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] < numbers[i + 1]){
                currentLength++;
                if(currentLength > maxLength){
                    maxLength = currentLength;
                    endIndex = i + 1;
                }
            }else{
                currentLength = 1;
            }
        }

        for (int i = endIndex - maxLength + 1; i < endIndex; i++){
            System.out.println(numbers[i]);
        }
        System.out.println(maxLength);

    }
}