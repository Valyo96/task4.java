import java.util.Scanner;
public class task4 {
    public static boolean checkWinner(char [][] m){
        for (int i=0; i< m.length; i++) {
            if ((m[i][0] == 'X' && m[i][1] == 'X' && m[i][2] == 'X') ||
                    (m[i][0] == 'O' && m[i][1] == 'O' && m[i][2] == 'O')) {
                if(m[i][0]=='O'){
                    System.out.println("Player one wins!");
                }else{
                    System.out.println("Player two wins!");
                }
                return true;
            }

            if ((m[0][i] == 'X' && m[1][i] == 'X' && m[2][i] == 'X') ||
                    (m[0][i] == 'O' && m[1][i] == 'O' && m[2][i] == 'O')) {
                if(m[0][i]=='O'){
                    System.out.println("Player one wins!");
                }else{
                    System.out.println("Player two wins!");
                }
                return true;
            }
        }

        if((m[0][0]=='X'&&m[1][1]=='X'&&m[2][2]=='X')||
                (m[0][0]=='O'&&m[1][1]=='O'&&m[2][2]=='O')){
            if(m[0][0]=='O'){
                System.out.println("Player one wins!");
            }else{
                System.out.println("Player two wins!");
            }
            return true;
        }

        if((m[0][2] == 'X' && m[1][1] == 'X' && m[2][0] == 'X') ||
                (m[0][2] == 'O' && m[1][1] == 'O' && m[2][0] == 'O')){
            if(m[0][2]=='O'){
                System.out.println("Player one wins!");
            }else{
                System.out.println("Player two wins!");
            }
            return true;
        }
        return false;
    }

    public static boolean checkBoard(char[][] m){
        for(int i=0; i< m.length; i++){
            for(int j=0; j< m[i].length; j++){
                if(m[i][j]=='.'){
                    return false;
                }
            }
        }
        System.out.println("Draw!");
        return true;
    }

    public static void printGame(char [][] n){
        System.out.println("---------------");
        for (int i=0; i< n.length; i++){
            for(int j=0; j< n[i].length; j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row;
        int column;
        char [][] ticTacToe={
                {'.','.','.'},
                {'.','.','.'},
                {'.','.','.'}
        };
        boolean playerOneTurn=true;
        while(!checkBoard(ticTacToe) && !checkWinner(ticTacToe)){
            printGame(ticTacToe);
            if(playerOneTurn){
                System.out.println("Player one enter your move(row, column)!");
                 row= sc.nextInt();
                 column= sc.nextInt();
                 if(row>=3||row<0||column>=3||column<0||ticTacToe[row][column]!='.'){
                     System.out.println("Invalid turn");
                 }else{
                     ticTacToe[row][column]='O';
                     playerOneTurn=false;
                 }
            }
            else{
                System.out.println("Player two enter your move(row, column)!");
                row= sc.nextInt();
                column= sc.nextInt();
                if(row>=3||row<0||column>=3||column<0||ticTacToe[row][column]!='.'){
                    System.out.println("Invalid turn");
                }else{
                    ticTacToe[row][column]='X';
                    playerOneTurn=true;
                }
            }
        }
        printGame(ticTacToe);
    }
}
