import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            // Get array length
            System.out.print("please enter array length :");
            int arrayLength = scanner.nextInt();

            if(arrayLength == 0){
                System.out.println("array length most be greater than 0");
                continue;
            }

            int[] numbers = new int[arrayLength];

            // Get array values
            for (int i = 0; i < arrayLength; i++) {
                System.out.print("please enter index " + i + " value :");
                numbers[i] = scanner.nextInt();
            }

            // Calculating the average of arrays
            float average = 0;
            for (int number : numbers) {
                average += number;
            }
            average /= arrayLength;
            System.out.println("average :" + average);

            System.out.println("Program finished.");
            scanner.close();
        }
        }

