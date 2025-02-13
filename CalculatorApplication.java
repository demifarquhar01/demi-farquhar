/**
 * This application is a simple calculator in java that performs addition, subtraction, multiplication, and division.
 * The user has to select the which operation to perform 
 * The application will run until the user select exit to stop the application
 */

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
       
        //Created scanner for user input
        Scanner scanner = new Scanner(System.in);
        //Loop
        while (true) {
            //Display operations for user to select operator
            System.out.println("\nCalculator Application");
            System.out.println();
            System.out.println("Please select an operation from the list:");
            System.out.println("+. Addition (+)");
            System.out.println("-. Subtraction (-)");
            System.out.println("*. Multiplication (*)");
            System.out.println("/. Division (/)");
            System.out.println("X. Exit");
            System.out.println();
            System.out.print("Please select one operation: ");
   
         char choice = scanner.next().charAt(0);
            
            //Exit condition
            if (choice == 'x' || choice == 'X') {
               System.out.println("Exiting Calculator...");
                break;
            }
            //Check if it is a valid operator 
           if (choice != '+' && choice != '-' && choice != '*' && choice != '/') {
               System.out.println("Invalid operator, please try again.");
               continue;
           }
           //User input first number
            System.out.print("Please enter the first number: ");
            double num1 = scanner.nextDouble(); 
            
            //User input second number
            System.out.print("Please enter the second number: ");
            double num2 = scanner.nextDouble(); 

            double result = 0; //initial variable for result
            boolean validOperation = true; 
            
            switch (choice) {

                case '+': //Addition
                    result = num1 + num2;
                    break;

                case '-': //Subtraction
                    result = num1 - num2;
                    break;

                case '*': //Multiplication
                    result = num1 * num2; 
                    break;

                case '/':
                    if (num2 != 0) { // division by zero 

                    //division operation
                        result = num1 / num2; 
                    } else {
                        System.out.println("Error!!!! Division by zero is invaild");
                        validOperation = false; 
                    }
                    break;
                }
            if (validOperation) {
               System.out.println("The final result is  " + result);
        //Display the final result
		System.out.println(num1 + " " + choice + " " + num2 + " = " + result);
            }
        }
        scanner.close(); //Close application
    }

}