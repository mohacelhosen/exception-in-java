package Exception;

/***
 Risky code must be inside try block and
 handling code must be in catch block
 ***/
public class TryCatchException {
    public static void main(String[] args) {
        System.out.println("Statement-1");
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Alternative code");
            System.out.println(10/2);
        }
        System.out.println("Statement-3");
    }
}
