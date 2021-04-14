/**
 * Author: PJ Duimstra
 * CSE 271
 * Project 4
 */

public class IllegalCheckerboardArgumentException extends Exception {
    /**
     * The default exception for IllegalCheckerboardArgumentException.
     */
    public IllegalCheckerboardArgumentException() {
        super();
    }

    /**
     * The  exception for IllegalCheckerboardArgumentException that returns a String.
     */
    public IllegalCheckerboardArgumentException(String message) {
        super(message);
    }
}
