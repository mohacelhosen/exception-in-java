package Exception;

/***
        Throwable
        /
 Exception
      /
Runtime Exception
      //
customize exception

 printStackTrace(); this method only available throwable class
 that's why we need to "extends" keyword to inherit.
 to print error description we need to pass the msg to throwable class by "super()" keyword
 ***/
public class InsufficientBalance extends RuntimeException{
    InsufficientBalance(String description_Of_Error){
        super(description_Of_Error);
    }
}
