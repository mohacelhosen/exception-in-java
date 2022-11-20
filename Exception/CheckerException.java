package Exception;
/***
 The exception which is checker by compiler for smooth execution is call checker exception.
 "maybe happen" type of error is checked by compiler
 ***/

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckerException {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pwr = new PrintWriter("test.txt");
        pwr.println("Welcome, the world of java");
    }
}
