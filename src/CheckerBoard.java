import javax.swing.*;

public class CheckerBoard extends JPanel {
    /*
    public static void main(String[] args) {
        char[][] test = new char[][] {
                {'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b'},
                {'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a'},
                {'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b'},
                {'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a'},
                {'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b'},
                {'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a'},
                {'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b'},
                {'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a'}
        };
        for (char[] c: test
             ) {
            for (char x: c
                 ) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    */

    private char[][] boardStatus;
    private final int ROW = 8, COLUMN = 8;

    public CheckerBoard(char[][] boardStatus) {
        boardStatus = new char[COLUMN][ROW];
        for (int i = 0; i < COLUMN; i++) {
            if (i % 2 == 0) {
                boardStatus[i][0] = 'e';
                boardStatus[i][2] = 'e';
                boardStatus[i][4] = 'e';
                boardStatus[i][6] = 'e';
            } else {
                boardStatus[i][1] = 'e';
                boardStatus[i][3] = 'e';
                boardStatus[i][5] = 'e';
                boardStatus[i][7] = 'e';
            }
        }
    }
}
