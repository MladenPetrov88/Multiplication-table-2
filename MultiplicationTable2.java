import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int multiply = 0;
        int result = num1 * num2;
        for (int i = num2; i <= 10 ; i++) {
            multiply = num1 * i;
            System.out.printf("%d X %d = %d%n", num1, i, multiply);

        }

        if (num2 > 10) {
            System.out.printf("%d X %d = %d", num1, num2, result);
        }
    }
}
