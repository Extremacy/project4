import javax.swing.*;
import java.awt.*;

/**
 * Author: PJ Duimstra
 * CSE 271
 * Project 4
 */

public class CheckerPiece extends JComponent {
    private char status;
    private int row, column;
    private boolean isPlayable;
    private final int SQUARE_LENGTH = 60, CHECKER_LENGTH = 40;

    /**
     * Constructor for the CheckerPiece object.
     * @param row the row that the piece is in.
     * @param column the column that the piece is in.
     * @param status the status of the piece.
     * @throws IllegalCheckerboardArgumentException thrown when an illegal status or position is inputted to a piece.
     */
    public CheckerPiece(int row, int column, char status) throws IllegalCheckerboardArgumentException {
        this.setRow(row);
        this.setColumn(column);
        this.setStatus(status);
        if (column % 2 == 0) {
            if (row % 2 == 0) {
                this.setPlayable(false);
            } else {
                this.setPlayable(true);
            }
        } else {
            if (row % 2 == 0) {
                this.setPlayable(true);
            } else {
                this.setPlayable(false);
            }
        }
    }

    /**
     * Getter method for the status instance property.
     * @return the status of the CheckerPiece object.
     */
    public char getStatus() {
        return status;
    }

    /**
     * Setter method for the status of a CheckerPiece object.
     * @param status the char to be set as the status.
     * @throws IllegalCheckerboardArgumentException thrown when an illegal status or position is inputted to a piece.
     */
    public void setStatus(char status) throws IllegalCheckerboardArgumentException {
        if (this.status == 'e' && !this.isPlayable) {
            throw new IllegalCheckerboardArgumentException("You cannot place a piece on a white square.");
        } else if (status == 'e'){
            this.status = status;
            CheckerGame.boardStatus[this.getRow()][this.getColumn()] = 'e';
            repaint();
        } else if (status == 'b') {
            this.status = status;
            CheckerGame.boardStatus[this.getRow()][this.getColumn()] = 'b';
            repaint();
        } else if (status == 'r') {
            this.status = status;
            CheckerGame.boardStatus[this.getRow()][this.getColumn()] = 'r';
            repaint();
        } else {
            throw new IllegalCheckerboardArgumentException("The status entered was invalid. (" + status + ")");
        }

    }

    /**
     * Getter method for the row instance property.
     * @return the row of the current object.
     */
    public int getRow() {
        return row;
    }

    /**
     * Setter method for the row instance property.
     * @param row the row to be set for the current object.
     * @throws IllegalCheckerboardArgumentException thrown when an illegal status or position is inputted to a piece.
     */
    public void setRow(int row) throws IllegalCheckerboardArgumentException {
        if (row <= 7 && row >= 0) {
            this.row = row;
        } else {
            throw new IllegalCheckerboardArgumentException("The row entered is invalid (" + row + ")");
        }
    }

    /**
     * Getter method for the column instance property.
     * @return the column of the instance property.
     */
    public int getColumn() {
        return column;
    }

    /**
     * Setter method for the column instance property.
     * @param column the column to be set for the current object.
     * @throws IllegalCheckerboardArgumentException thrown when an illegal status or position is inputted to a piece.
     */
    public void setColumn(int column) throws IllegalCheckerboardArgumentException {
        if (column <= 7 && column >= 0) {
            this.column = column;
        } else {
            throw new IllegalCheckerboardArgumentException("The column entered is invalid (" + column + ")");
        }

    }

    /**
     * Boolean expression that determines whether a space can hold a checker piece.
     * @param playable boolean that determines whether a place is playable.
     */
    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    /**
     * Paint override method, sets the pieces to their corresponding different looks.
     * @param g
     */
    public void paintComponent(Graphics g) {
        if (status == 'e' && !isPlayable) {
            g.setColor(Color.black);
            g.fillRect(0, 0, SQUARE_LENGTH, SQUARE_LENGTH);
            g.setColor(Color.white);
            g.fillRect(0, 0, SQUARE_LENGTH - 1, SQUARE_LENGTH - 1);
        } else if (status == 'e' && isPlayable) {
            g.setColor(Color.black);
            g.fillRect(0, 0, SQUARE_LENGTH, SQUARE_LENGTH);
            g.setColor(Color.green);
            g.fillRect(0, 0, SQUARE_LENGTH - 1, SQUARE_LENGTH - 1);
        } else if (status == 'b') {
            g.setColor(Color.black);
            g.fillRect(0, 0, SQUARE_LENGTH, SQUARE_LENGTH);
            g.setColor(Color.green);
            g.fillRect(0, 0, SQUARE_LENGTH - 1, SQUARE_LENGTH - 1);
            g.setColor(Color.black);
            g.fillOval(10, 10, CHECKER_LENGTH, CHECKER_LENGTH);
        } else if (status == 'r') {
            g.setColor(Color.black);
            g.fillRect(0, 0, SQUARE_LENGTH, SQUARE_LENGTH);
            g.setColor(Color.green);
            g.fillRect(0, 0, SQUARE_LENGTH - 1, SQUARE_LENGTH - 1);
            g.setColor(Color.red);
            g.fillOval(10, 10, CHECKER_LENGTH, CHECKER_LENGTH);
        }
    }
}
