import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      double num1;
      double num2;
      double res;
      char operator;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nEnter the operator (+, -, *, /): ");
      operator = reader.next().charAt(0);
      switch(operator) {
         case '+': res = num1 + num2;
            break;
         case '-': res = num1 - num2;
            break;
         case '*': res = num1 * num2;
            break;
         case '/': res = num1 / num2;
            break;
      default: System.out.printf("Error! Please Enter correct operator");
         return;
      }
      System.out.print("\nThe result is:\n");
      System.out.printf(num1 + " " + operator + " " + num2 + " = " + res);
   }
}