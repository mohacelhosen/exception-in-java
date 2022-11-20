package Exception;
/* Which statement will execute*/
public class CaseStudyTryCatchFinally2 {
    public static void main(String[] args) {
        try{
            System.out.println("Outer Try Statement");
            try{
                System.out.println(10/0);
            }catch (Exception e) {
                System.out.println("Inner Catch Statement");
            }finally{
                System.out.println("Inner Finally Statement");
            }
        }catch (Exception e) {
            System.out.println("Outer Catch Statement");
        }finally {
            System.out.println("Outer Finally Statement");
        }
    }
}
