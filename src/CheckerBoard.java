import javax.swing.*;
import java.awt.*;

public class CheckerBoard extends JPanel {
    private char[][] boardStatus;
    private final int ROW = 8, COLUMN = 8;

    public CheckerBoard(char[][] boardStatus) throws IllegalCheckerboardArgumentException {
        setSize(60, 40);
        GridLayout gridLayout = new GridLayout(8, 8);
        setLayout(gridLayout);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                add(new CheckerPiece(i, j, boardStatus[i][j]));
            }
        }
    }
}
