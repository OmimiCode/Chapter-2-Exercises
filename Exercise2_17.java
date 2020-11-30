import java.util.Arrays;
import java.util.Scanner;
/*2.17 (Arithmetic, Smallest and Largest)
Write an application that inputs three integers from the user and
displays the sum, average, product, smallest and largest of the numbers.
Use the techniques shown in Fig. 2.15.
[Note: The calculation of the average in this exercise should result in an integer representation of the average.
So, if the sum of the values is 7, the average should be 2, not 2.3333….]*/
public class Exercise2_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first integer: ");
        int input1 = scanner.nextInt();
        System.out.print("enter second integer: ");
        int input2 = scanner.nextInt();
        System.out.print("enter third integer: ");
        int input3 = scanner.nextInt();
        int n = 3;


        System.out.printf("the sum is %d%n", input1 + input2 + input3);
        System.out.printf("the average is %d%n", (input1 + input2 + input3) / n);
        System.out.printf("the product is %d%n", input1 * input2 * input3);

        //device an efficient means of getting the smaller and larger number
        if (input1 > input2 && input1 > input3) {
            System.out.printf("%d%s%n", input1, " is largest");
        }
        if (input1 < input2 && input1 < input3) {
            System.out.printf("%d%s%n", input1, " is smallest");
        }
        if (input2 > input1 && input2 > input3) {
            System.out.printf("%d%s%n", input2, " is largest");
        }
        if (input2 < input1 && input2 < input3) {
            System.out.printf("%d%s%n", input2, " is smallest");
        }
        if (input3 > input1 && input3 > input2) {
            System.out.printf("%d%s%n", input3, " is largerest");
        }
        if (input3 < input1 && input3 < input2) {
            System.out.printf("%d%s%n", input3, " is smallest");
        }
        if (input1 == input2 && input2 == input3) {
            System.out.print("these numbers are equal");
        }
        if( input1 == input2 && input1> input3) {
            System.out.printf("%d%s%n", input1, " is largest");
        }
        if (input1 == input2 && input1 < input3) {
            System.out.printf("%d%s%n", input1, " is smallest");
        }
        if (input2 == input3 && input3 > input1) {
            System.out.printf("%d%s%n", input2, " is largest");
        }
        if (input2 == input3 && input3 < input1) {
            System.out.printf("%d%s%n", input2, " is smallest");
        }
        if (input1 == input3 && input3 > input2) {
            System.out.printf("%d%s%n", input3 , " is largest");
        }
        if (input1 == input3 && input3 < input2) {
            System.out.printf("%d%s%n", input3, " is smallest");
        }
    }
}
