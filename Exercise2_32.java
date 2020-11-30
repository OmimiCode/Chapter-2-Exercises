import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/*2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and deter-
        mines and prints the number of negative numbers input, the number of positive numbers input and
        the number of zeros input.*/
public class Exercise2_32 {
    public static void main(String[] args) {
        int input1, input2, input3, input4, input5, zero=0, positive=0, negative=0;

        Scanner input= new Scanner(System.in);
        System.out.println("enter first digit " );
        input1 = input.nextInt();
        System.out.println("enter second digit " );
        input2 = input.nextInt();
        System.out.println("enter third digit " );
        input3 = input.nextInt();
        System.out.println("enter fourth digit " );
        input4 = input.nextInt();
        System.out.println("enter fifth digit " );
        input5 = input.nextInt();



        if(input1 == 0){
            zero++;
        }
        if(input1 > 0){
            positive++;
        }
        if(input1 < 0) {
            negative++;
        }


        if(input2 == 0){
            zero++;
        }
        if(input2 > 0){
            positive++;
        }
        if(input2 < 0) {
            negative++;
        }


        if(input3 == 0){
            zero++;
        }
        if(input3 > 0){
            positive++;
        }
        if(input3 < 0) {
            negative++;
        }


        if(input4 == 0){
            zero++;
        }
        if(input4 > 0){
            positive++;
        }
        if(input4 < 0) {
            negative++;
        }


        if(input5 == 0){
            zero++;
        }
        if(input5 > 0){
            positive++;
        }
        if(input5 < 0) {
            negative++;
        }

        System.out.println("zero inputs are " + zero);
        System.out.println("Negative inputs are " + negative);
        System.out.println("positive inputs are " + positive);
    }
}
