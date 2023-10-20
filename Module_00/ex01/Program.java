import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scnObj = new Scanner(System.in);
        System.out.println("Enter a number: ");

        try {
            int input = scnObj.nextInt();
            if (input < 2) {
                System.err.println("IllegalArgument");
                scnObj.close();
                return;
            }

			boolean isPrime = true;
			int it = 0;
            int sqrt = (int) Math.sqrt(input);
            if (input % 2 == 0 && input > 2) {
                isPrime = false;
            } else {
                for (int i = 3; i <= sqrt; i += 2) {
					it++;
                    if (input % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println("true " + it);
            } else {
                System.out.println("false " + it);
            }

        } catch (InputMismatchException e) {
            scnObj.close();
            System.err.println("IllegalArgument");
        }
    }
}
