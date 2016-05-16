/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Damilola
 */
public class WrongFormatException extends Exception {

    /**
     * Creates a new instance of <code>WrongFormatException</code> without
     * detail message.
     */
    public WrongFormatException() {
    }

    /**
     * Constructs an instance of <code>WrongFormatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public WrongFormatException(String msg) {
        super(msg);
    }
}
