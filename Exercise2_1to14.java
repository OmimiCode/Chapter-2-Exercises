public class Exercise2_1to14 {
/*    Self-Review Exercises
2.1 Fill in the blanks in each of the following statements:
            1. A(n) left brace ({) begins the body of every method, and a(n) right brace (}) ends the body of every method.
            2. You can use the if statement to make decisions.
            3. // (double forward slash) begins an end-of-line comment.
            4. Space characters, Tabs and /n (newline) are called white space.
            5. keywords are reserved for use by Java.
    6. Java applications begin execution at main method.
    7. Methods System.out.Print, System.out.Println and System.out.Printf display information in a command window.
2.2 State whether each of the following is true or false. If false, explain why.
            1. Comments cause the computer to print the text after the // on the screen when the program executes. False- Comments do not cause any action to be performed when the program executes. They’re used to document programs and improve their readability.
    2. All variables must be given a type when they’re declared. -True
    3. Java considers the variables number and NuMbEr to be identical. - False - Java is case sensitive, so these variables are distinct.
    4. The remainder operator (%) can be used only with integer operands. False- The remainder operator can also be used with non-integer operands in Java.
            5. The arithmetic operators *, /, %, + and - all have the same level of precedence. False - the level or order of precedence is (* , / and %), then (+ and  -) from left to right  following the rule of BODMAS (PEDMAS, in programming languages).
            2.3 Write statements to accomplish each of the following tasks:
            1. Declare variables c, thisIsAVariable, q76354 and number to be of type int.
    Int c, thisIsAVariable, q76354, number;
    Or
    Int c;
    Int thisIsAVariable;
    Int q76354;
    Int number;
    2.  Prompt the user to enter an integer.
            System.out.print (“enter an integer:  ” );

    3.  Input an integer and assign the result to int variable value. Assume Scanner variable input can be used to read a value from the keyboard.
    Int value = input.nextInt();
    4. Print "This is a Java program" on one line in the command window. Use method System.out.println.
            System.out.println(“This is a java program”);

    5. Print "This is a Java program" on two lines in the command window. The first line should end with Java. Use method System.out.printf and two %s format specifiers.
            System.out.printf ("%s%n%s%n", "This is a java", "program");

    6. If the variable number is not equal to 7, display "The variable number is not equal to 7".
    If (number != 7) {
        System.out.println ("The variable number is not equal to 7");
    }


2.4 Identify and correct the errors in each of the following statements:
            if (c < 7);   System.out.println("c is less than 7"); -error
 if (c => 7)   System.out.println("c is equal to or greater than 7"); -error
if (c >= 7)  { System.out.println("c is greater than or equal to 7");}
2.5 Write declarations, statements or comments that accomplish each of the following tasks:
    a)State that a program will calculate the product of three integers.
            b) Create a Scanner called input that reads values from the standard input.
    c) Declare the variables x, y, z and result to be of type int.
    d) Prompt the user to enter the first integer.
    e) Read the first integer from the user and store it in the variable x.
    f) Prompt the user to enter the second integer.
    g) Read the second integer from the user and store it in the variable y.
    h) Prompt the user to enter the third integer.
    i) Read the third integer from the user and store it in the variable z.
    j) Compute the product of the three integers contained in variables x, y and z, and assign the result to the variable result.
    k) Use System.out.printf to display the message "Product is" followed by the value of the variable result.







    // a program will calculate the product of three integers.
    Import java.util.Scanner;
    Public class Calculator{
        Int x,y,z;
        Public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print(“enter first number: ”)
            x= input.nextInt();

            System.out.print(“enter second number: ”)
            y= input.nextInt();

            System.out.print(“enter third number: ”)

            z= input.nextInt();

            int result = x*y*z;
            system.out.printf(“product is %d%n”, result);
        }
    }




2.6 Using the statements you wrote in Exercise 2.5,
    write a complete program that calculates and prints the product of three integers.


    // a program will calculate the product of three integers.
    Import java.util.Scanner;
    Public class Calculator{
        int x,y,z;
        Public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print(“enter first number: ”)
            x= input.nextInt();

            System.out.print(“enter second number: ”)
            y= input.nextInt();

            System.out.print(“enter third number: ”)

            z= input.nextInt();

            int result = x*y*z;
            system.out.printf(“product is %d%n”, result);
        }
    }


    Exercises
2.7 Fill in the blanks in each of the following statements:
            1. comments, declarations and statements are used to document a program and improve its readability.
    2.  A decision can be made in a Java program with a(n) if selection statement.
            3.  Calculations are normally performed by expression statements.
    4. The arithmetic operators with the same precedence as multiplication are division (/) and remainder or modulus (%).
            5. When parentheses in an arithmetic expression are nested, the innermost set of parentheses is evaluated first
    6.  A location in the computer’s memory that may contain different values at various times throughout the execution of a program is called a(n) memory location.
            2.8 Write Java statements that accomplish each of the following tasks:
    a) Display the message "Enter an integer:", leaving the cursor on the same line.
            b) Assign the product of variables b and c to variable a.
            c) Use a comment to state that a program performs a sample payroll calculation.

            System.out.print("Enter an integer:");
    a=b*c;
// a program performs a sample payroll calculation


2.9 State whether each of the following is true or false. If false, explain why.
    a) Java operators are evaluated from left to right.- TRUE
    b) The following are all valid variable names: _under_bar_, m928134, t5, j7, her_sales$, his_$account_total, a, b$, c, z and z2. – TRUE
    c) A valid Java arithmetic expression with no parentheses is evaluated from left to right. -TRUE
    d) The following are all invalid variable names: 3g, 87, 67h2, h22 and 2h. – TRUE
2.10 Assuming that x = 2 and y = 3, what does each of the following statements display?
    a) System.out.printf("x = %d%n", x);
    x =2

    b) System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
    Value of 2+2 is 4
    c) System.out.printf("x =");
    x =
    d) System.out.printf("%d = %d%n", (x + y), (y + x));
5=5
        2.11 Which of the following Java statements contain variables whose values are modified?
    a) p = i + j + k + 7;
    b) System.out.println("variables whose values are modified");
    c) System.out.println("a = 5");
    d) value = input.nextInt();
2.12 Given that y = ax3 + 7, which of the following are correct Java statements for this equation? a) y = a * x * x * x + 7;
    b) y = a * x * x * (x + 7);
    c) y = (a * x) * x * (x + 7);
    d) y = (a * x) * x * x + 7;
    e) y = a * (x * x * x) + 7;
    f) y = a * x * (x * x + 7);
2.13 State the order of evaluation of the operators in each of the following Java statements, and show the value of x after each statement is performed:
    a) x = 7 + 3 * 6 / 2 - 1;
    x=7+18/2-1
    x=7+9-1
    x=15

    b) x = 2 % 2 + 2 * 2 - 2 / 2;
    x= 0+2*2-2/2
    x= 0+4-2/2
    X= 0+4-1
    X=3
    c) x = (3 * 9 * (3 + (9 * 3 / (3))));
    X=(3*9(3+(9*1)))
    X=(3*9(3+(9)))
    X=(3*9(12))
    X=(3*9*12)
    X=324

   2.14 Write an application that displays the numbers 1 to 4 on the same line, with each pair of adjacent
   numbers separated by one space. Use the following techniques:
    a) Use one System.out.println statement.
            System.out.printIn(“1 2 3 4”);
    b) Use four System.out.print statements.
            System.out.print(“1 ”);
    System.out.print“2 ”);
System.out.print(“3 ”);
System.out.printI(“4”);
    c) Use one System.out.printf statement.
            System.out.printf(“%d%d%d%d%n”, 1, 2, 3, 4”);
    */
}
