import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // prints hello world
        System.out.println("Hello world!");

        // get user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}