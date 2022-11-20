package Exception;
/****
Inside the method if any error create, method will responsible to create an Exception Object where
 name + description + stack trace( location ) must include
 ***/
public class DefaultException {
    public static void main(String[] args) {
        doStaff();
    }
    public static void doStaff(){
        doMoreStaff();
        System.out.println(10/0);
        System.out.println("Thanks");
    }

    public static void doMoreStaff() {
        System.out.println("Welcome to the default Exception Handling maintain by JVM");
    }
}
