package Exception;

import java.util.Scanner;

public class CustomizeExceptionThrow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000;
        int withdraw = input.nextInt();
        if(withdraw > balance){
            throw new InsufficientBalance("You Don't have enough balance");
        }else {
            System.out.println("Here is your "+withdraw+" $");
        }
    }
}
