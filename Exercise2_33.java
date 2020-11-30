/*2.33 (Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in
        Exercise 1.10. The formulas for calculating BMI are
                    weightInPounds × 703
        BMI = ---------------------------------
               heightInInches × heightInInches
        or
                     weightInKilograms
        BMI = -------------------------------
                 heightInMeters × heightInMeters
        Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you pre-
        fer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s
        body mass index. Also, display the following information from the Department of Health and
        Human Services/National Institutes of Health so the user can evaluate his/her BMI:

        BMI VALUES
Underweight:  less than 18.5
Normal:   between 18.5 and 24.9
Overweight:  between 25 and 29.9
Obese: 30 or greater

100cm -1m
152.4       50

        */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2_33 {
    public static void main(String[] args) {
        double weightInKilograms, heightInMeters, BodyMassIndex;

        Scanner input = new Scanner(System.in);
        System.out.println("enter your weight in kg");
        weightInKilograms = input.nextDouble();

        System.out.println("enter your height in meters");
        heightInMeters = input.nextDouble();


        BodyMassIndex = weightInKilograms / heightInMeters * heightInMeters;

        if (BodyMassIndex < 18.5) {
        System.out.println("you are UNDERWEIGHT");
        }

        if (BodyMassIndex >= 18.5 && BodyMassIndex <=24.9) {
        System.out.println("your BMI is NORMAL");
        }

        if (BodyMassIndex >= 25 && BodyMassIndex <=29.9) {
            System.out.println("you are OVERWEIGHT");
        }

        if (BodyMassIndex >=30) {
            System.out.println("you are OBESED");
        }

    }
}

