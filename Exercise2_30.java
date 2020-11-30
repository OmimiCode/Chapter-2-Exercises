/*2.30 (Separating the Digits in an Integer) Write an application that inputs one number consist-
        ing of five digits from the user, separates the number into its individual digits and prints the digits
        separated from one another by three spaces each. For example, if the user types in the number 42339 ,
        the program should print.
        Assume that the user enters the correct number of digits. What happens when you enter a
        number with more than five digits? What happens when you enter a number with fewer than five
        digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
        need to use both division and remainder operations to “pick off ” each digit.]*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter query consisting of five (5) digits");
        int userInput = input.nextInt();
//        45679
        int tenThousand = userInput / 10000;
        int thousandMod = userInput % 10000;

        int thousand = thousandMod / 1000;
        int hundredMod = thousandMod % 1000;

        int hundred = hundredMod / 100;
        int tenMod = hundredMod % 100;

        int ten = tenMod / 10;
        int unitMod =  tenMod % 10;

        int unit = unitMod / 1;


        System.out.printf( "%d%s%d%s%d%s%d%s%d%n",tenThousand," ",thousand," ",hundred, " ",ten, " ",unit );

    }


}
