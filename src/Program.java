import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter mathematical operations (plus \"+\", minus \"-\", multiply \"*\", divide \"/\"): ");
        String fromUser = scanner.nextLine();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        switch (fromUser.toLowerCase())  {
            case "+":
                System.out.println("Summation result: " + (a + b));

                break;
            case "-":
                System.out.println("Subtraction result: " + (a - b));

                break;
            case "*":
                System.out.println("Multiplication result " + (a * b));

                break;
            case "/":
                System.out.println("Division result: " + (a / b));

                break;
            default:
                System.out.println("There is no such functions");
        }

    }
}