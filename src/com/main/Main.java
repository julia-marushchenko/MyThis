/**
 * Java program to demonstrate that new object of a class should be initialized.
 */
package com.main;

/**
 * Test class.
 */
class Test {

    // Method show to print to console
    void show() {
        System.out.println("Method show() is called.");
    }
}

/**
 * Main class.
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating Test object
        Test t;

        // Compilation error here because t is not initialized

        // Calling method show()
        t.show();
    }
}