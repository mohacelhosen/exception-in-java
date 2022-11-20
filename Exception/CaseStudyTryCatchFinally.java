package Exception;
/*which are statements will execute */
public class CaseStudyTryCatchFinally {
    public static void main(String[] args) {
        try{
            System.out.println("Statement-1");
            System.out.println(10/0);
            System.out.println("Statement-3");
        }catch (ArithmeticException e){
            System.out.println(0/0);
            System.out.println("Catch statement");
        }finally {
            System.out.println("Finally statement");
        }
        System.out.println("Last statement");
    }
}
