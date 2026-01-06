import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Program finished");
        }
    }
}
