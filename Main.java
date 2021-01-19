import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //variables
        String name;
        double weight;
        int feet;
        int inches;
        //prompts user
        System.out.print("Welcome! What is your name?: ");
        name = input.nextLine();
        System.out.print("What is your weight in pounds?: ");
        weight = input.nextFloat();
        System.out.print("What is your height in feet?: ");
        feet = input.nextInt();
        System.out.print("How many inches?: ");
        inches = input.nextInt();
        //converting
        double weightinKilos = weight * 0.453592;
        double heightinMeters = (((feet * 12) + inches) * .0254);
        double bmi = weightinKilos / Math.pow(heightinMeters, 2.0);
//      double bmi = weightinKilos / (heightInMeters * heightInMeters);

        //display output
        System.out.println("Hello " + name + ", Your English BMI is: " + (double) Math.round(bmi*100)/100);
        
        //gives response on user input of their BMI
        if (bmi < 18.5 ) {
            System.out.print("You are Underweight");
        }
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.print("You are Normal");
        }
        else if (bmi >= 25 && bmi < 30) {
            System.out.print("You are Overweight");
        }
        else if (bmi >= 30) {
            System.out.print("You are Obese");
        }
    }

}