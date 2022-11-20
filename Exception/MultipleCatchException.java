package Exception;

/***
 If any exception on try block, it will terminate and control goes to catch block
 and also it never return on try block to execute rest code of try block.
 ***/

public class MultipleCatchException {
    public static void main(String[] args) {

        try{
            System.out.println("First Statement");
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println("Think again");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
