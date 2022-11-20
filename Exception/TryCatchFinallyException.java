package Exception;
/***
 if you enter try block no matter what finally block will execute
***/
public class TryCatchFinallyException {
    public static void main(String[] args) {
        try{
            System.out.println("Try block");
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.print("Handling code : ");
            System.out.println(e);
            e.printStackTrace(); //it will show end of the program
        }finally {
            System.out.println("Ending code");
        }
    }
}
