/*2.16 (Comparing 33Integers) Write an application that asks the user to enter two integers,
obtains them from the user and displays the larger number followed by the words "is larger".
If the numbers are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.*/

import java.util.Scanner;
public class Exercise2_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first integer: ");
        int input1 = scanner.nextInt();
        System.out.print("enter second integer: ");
        int input2 = scanner.nextInt();

        if (input1 > input2) {
            System.out.printf("%d%s%n", input1, " is larger");
        } else {
            if (input2 > input1) {
                System.out.printf("%d%s%n", input2, " is larger");
            } else {
                if (input1 == input2 && input2 == input1) {
                    System.out.print("these numbers are equal");
                }
            }
        }
    }
}
