import java.util.Scanner;

public class task2 {
    public static void printArray(int[] array){
        System.out.print("All the even numbers from the matrix = { ");
        for(int i=0; i< array.length; i++){
            if(i== array.length-1) {
                System.out.print(array[i]+" }");
            }else{
                System.out.print(array[i] + ", ");
            }
        }
    }
    public static int countEven(int[][] m){
        int count=0;
        for(int i=0; i< m.length; i++){
            for (int j=0; j< m[i].length; j++){
                if(m[i][j]%2==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static int[] returnAllEvenNumbers( int[][] matrix){
        int numbersOfEvens=countEven(matrix);
        int [] evenNumbers=new int[numbersOfEvens];
        int index=0;
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                if(matrix[i][j]%2==0){
                    evenNumbers[index]=matrix[i][j];
                    index++;
                }
            }
        }
        return evenNumbers;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the desired number of rows: ");
        int rows= sc.nextInt();
        System.out.print("Enter the desired number of columns: ");
        int columns= sc.nextInt();
        int [][] numbers=new int[rows][columns];
        for(int i=0; i< numbers.length; i++){
            for(int j=0; j< numbers[i].length; j++){
                System.out.print("Enter element "+(j+1)+" : ");
                numbers[i][j]=sc.nextInt();
            }
            System.out.println("----------------");
        }
        int [] evenNumbers=returnAllEvenNumbers(numbers);
        printArray(evenNumbers);
    }
}
