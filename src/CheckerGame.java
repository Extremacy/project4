import javax.swing.*;
import java.awt.*;

public class CheckerGame extends JFrame {
    public static void main(String[] args) throws IllegalCheckerboardArgumentException {
        JFrame game = new CheckerGame();
        game.setVisible(true);
    }
    public CheckerGame() throws IllegalCheckerboardArgumentException {
        char[][] boardStatus = new char[][] {
            {'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b'},
            {'b', 'e', 'b', 'e', 'b', 'e', 'b', 'e'},
            {'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b'},
            {'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e'},
            {'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e'},
            {'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e'},
            {'e', 'r', 'e', 'r', 'e', 'r', 'e', 'r'},
            {'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e'}
         };
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        CheckerBoard panel = new CheckerBoard(boardStatus);
        panel.setLayout(new GridLayout(8, 8, 0, 0));
        setSize(505, 585);
        add(panel);
    }
}
