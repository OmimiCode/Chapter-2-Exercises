import java.util.Arrays;
import java.util.Scanner;

/*     2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines
     and prints the largest and smallest integers in the group. Use only the programming techniques you
     learned in this chapter.*/
public class Exercise2_24 {
    public static void main(String[] args) {
// develop an easy method

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first query: ");
        int input1= scanner.nextInt();
        System.out.println("enter second query: ");
        int input2= scanner.nextInt();
        System.out.println("enter third query: ");
        int input3= scanner.nextInt();
        System.out.println("enter fourth query: ");
        int input4= scanner.nextInt();
        System.out.println("enter fifth query: ");
        int input5= scanner.nextInt();


        int num = 0;
        if(num >= input1)
            num = input1;
        if(num >= input2)
            num = input2;
        if(num >= input3)
            num = input3;
        if(num >= input4)
            num = input4;
        if(num >= input5)
            num = input5;
        System.out.printf( "%d%s%n", num, " is largest" );


    }
}

