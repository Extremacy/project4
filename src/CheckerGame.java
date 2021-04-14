import javax.swing.*;
import java.awt.*;

/**
 * Author: PJ Duimstra
 * CSE 271
 * Project 4
 */

public class CheckerGame extends JFrame {
    public static char[][] boardStatus;

    /**
     * Main driver for the Checker game app.
     * @param args n/a
     * @throws IllegalCheckerboardArgumentException thrown when an illegal status or position is inputted to a piece.
     */
    public static void main(String[] args) throws IllegalCheckerboardArgumentException {
        JFrame game = new CheckerGame();
        game.setTitle("Checker Game");
        game.setVisible(true);
    }

    /**
     * Constructor for the CheckerGame object.
     * @throws IllegalCheckerboardArgumentException thrown when an illegal status or position is inputted to a piece.
     */
    public CheckerGame() throws IllegalCheckerboardArgumentException {
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

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(505, 585);
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu game = new JMenu("Game");
        JMenuItem newGame = new JMenuItem("New");
        JMenuItem exit = new JMenuItem("Exit");
        game.add(newGame);
        game.add(exit);
        menuBar.add(game);
        JMenu help = new JMenu("Help");
        JMenuItem rules = new JMenuItem("Checker Game Rules");
        JMenuItem about = new JMenuItem("About Checker Game App");
        help.add(rules);
        help.add(about);
        menuBar.add(help);
        add(menuBar, BorderLayout.NORTH);

        CheckerBoard panel = new CheckerBoard(boardStatus);
        panel.setLayout(new GridLayout(8, 8, 0, 0));
        add(panel, BorderLayout.CENTER);

        JLabel text = new JLabel();
        int[] gameStatus = updateCount();
        String status = String.format("Red: %d Black: %d \n This game was developed by PJ Duimstra", gameStatus[0], gameStatus[1]);
        text.setText(status);
        add(text, BorderLayout.SOUTH);
    }

    /**
     * Updates the amount of red/black objects on the game board.
     * @return array representing the number of black and red objects on the games board.
     */
    public static int[] updateCount() {
        int[] counters = new int[2];
        int redCounter = 0;
        int blackCounter = 0;
        for (char[] charArr: boardStatus
        ) {
            for (char c: charArr
            ) {
                if (c == 'b') {
                    blackCounter++;
                } else if (c == 'r') {
                    redCounter++;
                }
            }
        }
        counters[0] = redCounter;
        counters[1] = blackCounter;
        return counters;
    }
}
