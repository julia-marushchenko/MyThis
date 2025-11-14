/**
 * Java program to use this for initialization fields of a class object.
 */

package com.initialization;

/**
 * Main class.
 */
public class Main {

    long number;
    long number1;

    // Default constructor
    public Main() {

        this(10L, 20L);

    }

    // Parametrized constructor
    public Main(long number, long number1) {

        this.number = number;
        this.number1 = number1;

    }

    // Main method to run java program
    public static void main(String[] args) {

        Main main = new Main();

    }
}
