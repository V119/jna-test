package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        int max = JnaLibrary.INSTANCE.max(100, 200);
        System.out.println("max: " + max);
    }
}
