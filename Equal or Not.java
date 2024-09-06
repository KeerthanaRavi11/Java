//Given two input equal or not
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();

        if (num1 == num2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
