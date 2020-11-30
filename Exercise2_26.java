import java.util.Scanner;

/*2.26 (Multiples) Write an application that reads two integers, determines whether the first is a
        multiple of the second and prints the result. [Hint: Use the remainder operator.]*/
public class Exercise2_26 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter multiple query integer");
        int userInput1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter query integer");
        int userInput2 = input2.nextInt();




        if(userInput2 % userInput1 == 0){
            System.out.printf("%d%s%d%n", userInput1, " is a multiple of ", userInput2);
        }
        if(userInput2 % userInput1 != 0){
            System.out.printf("%d%s%d%n", userInput1, " is  NOT a multiple of ", userInput2);
        }

    }
}
