import java.util.Arrays;
import java.util.Scanner;

/*2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even.
[Hint: Use the remainder operator. An even number is a multiple of 2.
Any multiple of 2 leaves a remainder of 0 when divided by 2.]*/
public class Exercise2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter query integer");
        int userInput = input.nextInt();
        if(userInput%2==0){
            System.out.println("your input is an EVEN number");
        }
        if(userInput%2==1){
            System.out.println("your input is a ODD number ");
        }




    }
}
