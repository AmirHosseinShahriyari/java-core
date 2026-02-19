import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter array 1 length :");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array length most be greater than 0");
            scanner.close();
            return;
        }

        int[] numbers1 = new int[n];


        System.out.print("Please enter array 2 length :");
        n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array length most be greater than 0");
            scanner.close();
            return;
        }

        int[] numbers2 = new int[n];


        System.out.println("Please enter array 1 values =>");
        for (int i = 0; i < numbers1.length; i++){
            System.out.print("Please enter index " + i + " value:");
            numbers1[i] = scanner.nextInt();
        }


        System.out.println("Please enter array 2 values =>");
        for (int i = 0; i < numbers2.length; i++){
            System.out.print("Please enter index " + i + " value:");
            numbers2[i] = scanner.nextInt();
        }

        int[] sum = new int[numbers1.length + numbers2.length];

        for (int i = 0; i < numbers1.length; i++){
            sum[i] = numbers1[i];
        }

        int j = 0;
        for (int i = 0; i < numbers2.length; i++){
            sum[i + numbers1.length] = numbers2[j];
            j++;
        }

        System.out.print("Result: [ ");
        for (int i = 0; i < sum.length; i++){
            if(i == sum.length - 1){
                System.out.print(sum[i]);
            }else {
                System.out.print(sum[i] + ",");
            }
        }
        System.out.print(" ]");
        System.out.println();

        System.out.println("Program finished.");
        scanner.close();



        }
    }
