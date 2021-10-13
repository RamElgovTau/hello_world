import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello world!");
        int i = 0;
        do {
            System.out.println("I see you are in a math mode today. it is great!");
            System.out.print("calculate factorial of the integer: ");
            System.out.println("the answer is: " + factorial(scanner.nextInt()));
            i++;
        } while (i < 100);
    }

    /**
     * this is an unsafe recursive function for calculating factorial. it'll probably
     * get into a stack overflow exception at low numbers.
     * @param n - the number to calculate factorial on
     * @return the factorial
     */

    public static long factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n-1);

    }
}
