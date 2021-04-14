import javax.swing.*;
import java.awt.*;

/**
 * Author: PJ Duimstra
 * CSE 271
 * Project 4
 */

public class CheckerBoard extends JPanel {
    private char[][] boardStatus;

    /**
     * Constructor for the checkerboard object.
     * @param boardStatus the double array holding the status of the CheckerPieces.
     * @throws IllegalCheckerboardArgumentException thrown when an illegal status or position is inputted to a piece.
     */
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

    /**
     * Setter for the boardStatus double array.
     * @param boardStatus the double array holding the status' for the checkers pieces.
     */
    public void setBoardStatus(char[][] boardStatus) {
        this.boardStatus = boardStatus;
        repaint();
    }

    /**
     * Setter for an individual checker peice.
     * @param row the row of the new checker piece object.
     * @param column the column of the new checker piece object.
     * @param status the status of the new checker peice object.
     * @throws IllegalCheckerboardArgumentException thrown when an illegal status or position is inputted to a piece.
     */
    public void setCheckerPiece(int row, int column, char status) throws IllegalCheckerboardArgumentException {
        add(new CheckerPiece(row, column, status));
    }
}
