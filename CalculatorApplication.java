/**
 * This application is a simple calculator in java that performs addition, subtraction, multiplication, and division.
 * The user has to select the which operation to perform 
 * The application will run until the user select exit to stop the application
 */

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.println("\nCalculator Application");
            System.out.println();
            System.out.println("Please select an operation from the list:");
            System.out.println("+. Addition (+)");
            System.out.println("-. Subtraction (-)");
            System.out.println("*. Multiplication (*)");
            System.out.println("/. Division (/)");
            System.out.println("X. Exit");
            System.out.println();
            System.out.print("Please Select one operation: ");
            
            char choice = scanner.next().charAt(0);

            if (choice == 'x' || choice == 'X') {
               System.out.println("Exiting Calculator...");
                break;
            }
           if (choice != '+' && choice != '-' && choice != '*' && choice != '/') {
               System.out.println("Invalid operator, please try again.");
               continue;
           }
            System.out.print("Please enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Please enter the second number: ");
            double num2 = scanner.nextDouble();

            boolean validOperation = true; 

            switch (choice) {

                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2; 
                    break;

                case '/':
                    if (num2 != 0) {

                    //division operation
                        result = num1 / num2; 
                    } else {
                        System.out.println("Error!!!! Division by zero is invaild");
                        validOperation = false; 
                    }
                    break;
                }
            if (validOperation) {
               System.out.println("The Result is given is : " + result);

		System.out.println(num1 + " " + choice + " " + num2 + " = " + result);
            }
        }
        scanner.close();
    }

}