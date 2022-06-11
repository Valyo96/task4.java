import java.util.Scanner;

public class task1 {
    public static void printRepeatedNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print("The duplicate element(s) in the given array are/is: " + array[j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the value of element " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }
        printRepeatedNumbers(numbers);
    }
}
