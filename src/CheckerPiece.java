import javax.swing.*;

public class CheckerPiece extends JComponent {
    private char status;
    private int row, column;

    public CheckerPiece(int row, int column, char status) throws IllegalCheckerboardArgumentException {
        this.setRow(row);
        this.setColumn(column);
        this.setStatus(status);
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) throws IllegalCheckerboardArgumentException {
        if (status == 'e') {
            this.status = status;
        } else if (status == 'b') {
            this.status = status;
        } else if (status == 'r') {
            this.status = status;
        } else {
            throw new IllegalCheckerboardArgumentException("The status entered was invalid (" + status + ")");
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

    public void setColumn(int column) {
        this.column = column;
    }
}
