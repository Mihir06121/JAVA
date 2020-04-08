/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
import java.io.*;

class HelloWorld {
    public static void main(final String[] args) throws IOException {
        System.out.println("Hello World!"); // Display the string.

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a char: ");
        final char ch = (char) br.read();
        System.out.println("You entered : "+ch);
    
    }
}

