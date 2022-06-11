import java.util.Scanner;

public class task3 {
    public static void printResults(int [][] m){
        for(int i=0; i< m.length; i++){
            for (int j=0; j<m[i].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int [][] multiplyMatrices(int [][] a, int [][] b){
        int [][] resultMatrix=new int[a.length][b[0].length];
        int startRow=0;
        int startColumn=0;
        int currentSum=0;
        for(int i=0; i<a.length*b[0].length; i++){
            for(int rotate=0; rotate< b.length; rotate++){
                currentSum+=a[startRow][rotate]*b[rotate][startColumn];
            }
            resultMatrix[startRow][startColumn]=currentSum;
            currentSum=0;
            if(startColumn!=b[0].length-1){
                startColumn++;
            }else{
                startRow++;
                startColumn=0;
            }
        }
        return resultMatrix;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the desired number of rows of matrix A: ");
        int rows= sc.nextInt();
        System.out.print("Enter the desired number of columns of matrix A: ");
        int columns= sc.nextInt();

        System.out.print("Enter the desired number of rows of matrix B: ");
        int rows2= sc.nextInt();
        System.out.print("Enter the desired number of columns matrix B: ");
        int columns2= sc.nextInt();

        if(columns!=rows2){
            System.out.println("Cannot multiply matrices!");
            return;
        }
        System.out.println("-----------------");
        int [][] matrixB=new int[rows2][columns2];
        int [][] matrixA=new int[rows][columns];
        System.out.println("Matrix A: ");
        for(int i=0; i< matrixA.length; i++){
            for(int j=0; j< matrixA[i].length; j++){
                System.out.print("Enter element"+"("+i+", "+j+"): ");
                matrixA[i][j]=sc.nextInt();
            }
            System.out.println("----------------");
        }

        System.out.println("Matrix B: ");
        for(int i=0; i< matrixB.length; i++){
            for(int j=0; j< matrixB[i].length; j++){
                System.out.print("Enter element"+"("+i+", "+j+"): ");
                matrixB[i][j]=sc.nextInt();
            }
            System.out.println("----------------");
        }
        int [][] resultMatrix= multiplyMatrices(matrixA, matrixB);
        printResults(resultMatrix);
    }
}
