import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calculator c = new Calculator();
        String input = "";
        while (true) {
            System.out.println("Enter command:");
            input = s.next();
            if (input.equals("quit")) break;
            else if (input.equals("add"))
                System.out.println(c.add(s.nextInt(), s.nextInt()));
            else if (input.equals("multiply"))
                System.out.println(c.multiply(s.nextInt(), s.nextInt()));
            else if (input.equals("divide"))
                System.out.println(c.divide(s.nextInt(), s.nextInt()));
            else if (input.equals("fib"))
                System.out.println(c.fibonacciNumberFinder(s.nextInt()));
            else if (input.equals("binary"))
                System.out.println(c.intToBinaryNumber(s.nextInt()));
            else if (input.equals("subtract"))
                System.out.println(c.subtract(s.nextInt(), s.nextInt()));
            else System.out.println("Invalid command");
            s.nextLine();
        }
    }
}
