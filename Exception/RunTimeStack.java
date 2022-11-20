package Exception;

/***
 In the beginning, main thread create a stack where

 main method will add
 doStaff method will add
 doMoreStaff method will add

    |              |
    |    main()    |
    |   doStaff()  |
    |doMoreStaff() |
    |______________|
        Stack
 after execute all the method JVM destroy the stack
 ***/
public class RunTimeStack {
    public static void main(String[] args) {
        doStaff();
    }
    public static void doStaff(){
        doMoreStaff();
    }
    public static void doMoreStaff(){
        System.out.println("Welcome");
    }
}
