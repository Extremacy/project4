import javax.swing.*;
import java.awt.*;

public class CheckerPiece extends JComponent {
    private char status;
    private int row, column;
    private boolean isPlayable;
    private final int SQUARE_LENGTH = 60, CHECKER_LENGTH = 40;

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

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) throws IllegalCheckerboardArgumentException {
        if (this.status == 'e' && !this.isPlayable) {
            throw new IllegalCheckerboardArgumentException("You cannot place a piece on a white square.");
        } else if (status == 'e'){
            this.status = status;
        } else if (status == 'b') {
            this.status = status;
        } else if (status == 'r') {
            this.status = status;
        } else {
            throw new IllegalCheckerboardArgumentException("The status entered was invalid. (" + status + ")");
        }

    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) throws IllegalCheckerboardArgumentException {
        if (row <= 7 && row >= 0) {
            this.row = row;
        } else {
            throw new IllegalCheckerboardArgumentException("The row entered is invalid (" + row + ")");
        }
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) throws IllegalCheckerboardArgumentException {
        if (column <= 7 && column >= 0) {
            this.column = column;
        } else {
            throw new IllegalCheckerboardArgumentException("The column entered is invalid (" + column + ")");
        }

    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

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
