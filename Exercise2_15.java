import java.util.Scanner;
/* 2.15 (Arithmetic) Write an application that asks the user to enter two integers,
obtains them from the user and prints their sum, product,
difference and quotient (division). Use the techniques shown in Fig. 2.7. */
public class Exercise2_15 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first integer  :");
        int input1 = scanner.nextInt();
        System.out.print("enter second integer :");
        int input2 = scanner.nextInt();

        System.out.printf("the sum is %d%n",input1+input2);
        System.out.printf("the product is %d%n",input1*input2);
        System.out.printf("the difference is %d%n",input1-input2);
        System.out.printf("the quotient is %d%n",input1/input2);
    }
}
