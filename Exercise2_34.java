/*2.34 (World Population Growth Calculator) Use the web to determine the current world population and
the annual world population growth rate. Write an application that inputs these values,
        then displays the estimated world population after one, two, three, four and five years.*/

import java.util.Arrays;
import java.util.Scanner;
public class Exercise2_34 {

    //public class WorldPopulationGrowthCalc{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        long population = input.nextLong();

        System.out.print("Enter annual world population growth rate: ");
        double growthRate = input.nextDouble();


        long yearOne = population;
        long yearTwo = (long) (yearOne * growthRate);
        long yearThree = (long) (yearTwo * growthRate);
        long yearFour = (long) (yearThree * growthRate);
        long yearFive = (long) (yearFour * growthRate);


        System.out.println("year 1 = " + yearOne);
        System.out.println("year 2 = " + yearTwo);
        System.out.println("year 3 = " + yearThree);
        System.out.println("year 4 = " + yearFour);
        System.out.println("year 5 = " + yearFive);
    }

        }

