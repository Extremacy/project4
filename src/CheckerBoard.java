import javax.swing.*;
import java.awt.*;

public class CheckerBoard extends JPanel {
    private char[][] boardStatus;
    private final int ROW = 8, COLUMN = 8;
    private JPanel panel;
    private GridLayout gridLayout;

    public CheckerBoard(char[][] boardStatus) throws IllegalCheckerboardArgumentException {
        boardStatus = new char[][] {
            {'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b'},
            {'b', 'e', 'b', 'e', 'b', 'e', 'b', 'e'},
            {'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b'},
            {'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e'},
            {'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e'},
            {'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e'},
            {'e', 'r', 'e', 'r', 'e', 'r', 'e', 'r'},
            {'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e'}
        };

        gridLayout = new GridLayout(8, 8);
        panel = new JPanel(gridLayout);
        int rowCounter = 0;
        int columnCounter = 0;
        for (char[] c: boardStatus
             ) {
            for (char x: c
                 ) {
                CheckerPiece currentPiece = new CheckerPiece(rowCounter, columnCounter, x);
                columnCounter++;
            }
            rowCounter++;
        }
    }
}
